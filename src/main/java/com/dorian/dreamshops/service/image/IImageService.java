package com.dorian.dreamshops.service.image;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.dorian.dreamshops.dto.ImageDto;
import com.dorian.dreamshops.model.Image;

public interface IImageService {
    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);

    void updateImage(MultipartFile file, Long productId);
}
