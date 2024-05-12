package com.ss.android.ugc.aweme.services.now.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeNowDraftKt {
    public static final Bitmap getBackBitmap(CreativeNowDraft creativeNowDraft) {
        NowsShootModel nowsShootData;
        String str;
        Bitmap bitmap;
        o.LJIIIZ(creativeNowDraft, "<this>");
        NowsShootModel nowsShootData2 = creativeNowDraft.getNowsShootData();
        if (nowsShootData2 == null || (bitmap = nowsShootData2.backBitmap) == null) {
            NowsShootModel nowsShootData3 = creativeNowDraft.getNowsShootData();
            if ((nowsShootData3 == null || (str = nowsShootData3.backImageSharePath) == null) && ((nowsShootData = creativeNowDraft.getNowsShootData()) == null || (str = nowsShootData.backImagePath) == null)) {
                str = "";
            }
            return BitmapFactory.decodeFile(str);
        }
        return bitmap;
    }

    public static final Bitmap getFrontBitmap(CreativeNowDraft creativeNowDraft) {
        NowsShootModel nowsShootData;
        String str;
        Bitmap bitmap;
        o.LJIIIZ(creativeNowDraft, "<this>");
        NowsShootModel nowsShootData2 = creativeNowDraft.getNowsShootData();
        if (nowsShootData2 == null || (bitmap = nowsShootData2.frontBitmap) == null) {
            NowsShootModel nowsShootData3 = creativeNowDraft.getNowsShootData();
            if ((nowsShootData3 == null || (str = nowsShootData3.frontImageSharePath) == null) && ((nowsShootData = creativeNowDraft.getNowsShootData()) == null || (str = nowsShootData.frontImagePath) == null)) {
                str = "";
            }
            return BitmapFactory.decodeFile(str);
        }
        return bitmap;
    }

    public static final int getType(CreativeNowDraft creativeNowDraft) {
        o.LJIIIZ(creativeNowDraft, "<this>");
        NowsShootModel nowsShootData = creativeNowDraft.getNowsShootData();
        if (nowsShootData != null) {
            return nowsShootData.type;
        }
        return 0;
    }

    public static final boolean isPhotoDraft(CreativeNowDraft creativeNowDraft) {
        o.LJIIIZ(creativeNowDraft, "<this>");
        if (getType(creativeNowDraft) == 0) {
            return true;
        }
        return false;
    }
}
