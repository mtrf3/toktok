package com.bytedance.vcloud.abrmodule;

import java.util.List;

/* loaded from: classes7.dex */
public interface ISegmentInfo {
    long getBitrate();

    int getEndIndex();

    String getFileId();

    List<? extends ISegmentItem> getItems();

    int getMediaType();

    int getStartIndex();

    int getTotalNum();
}
