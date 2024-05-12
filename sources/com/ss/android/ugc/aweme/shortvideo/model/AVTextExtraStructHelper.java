package com.ss.android.ugc.aweme.shortvideo.model;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class AVTextExtraStructHelper {
    public static final AVTextExtraStructHelper INSTANCE = new AVTextExtraStructHelper();

    public static final AVTextExtraStruct createCommentChainBoundaryStruct(String chainText) {
        o.LJIIIZ(chainText, "chainText");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 2;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(chainText);
        aVTextExtraStruct.setTransient(true);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createDuetChainBoundaryStruct(String chainText) {
        o.LJIIIZ(chainText, "chainText");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(chainText);
        aVTextExtraStruct.setTransient(true);
        aVTextExtraStruct.setDuet(true);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createStitchChainBoundaryStruct(String chainText) {
        o.LJIIIZ(chainText, "chainText");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(chainText);
        aVTextExtraStruct.setTransient(true);
        aVTextExtraStruct.setDuet(false);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct from(TextExtraStruct struct) {
        o.LJIIIZ(struct, "struct");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.cid = struct.getCid();
        aVTextExtraStruct.hashTagName = struct.getHashTagName();
        aVTextExtraStruct.userId = struct.getUserId();
        aVTextExtraStruct.atUserType = struct.getAtUserType();
        aVTextExtraStruct.type = struct.getType();
        aVTextExtraStruct.start = struct.getStart();
        aVTextExtraStruct.end = struct.getEnd();
        aVTextExtraStruct.awemeId = struct.getAwemeId();
        aVTextExtraStruct.subType = struct.getSubtype();
        aVTextExtraStruct.setSecUid(struct.getSecUid());
        return aVTextExtraStruct;
    }

    public final int getChainTextLength(String chainText) {
        o.LJIIIZ(chainText, "chainText");
        return s.LJZL(chainText).toString().length();
    }

    public static final AVTextExtraStruct createQAStickerChainBoundaryStruct(String chainText, int i) {
        o.LJIIIZ(chainText, "chainText");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = i;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(chainText);
        aVTextExtraStruct.setTransient(true);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createCommentStruct(int i, int i2, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 2;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createQuestionStruct(int i, int i2, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 3;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createAtStruct(int i, int i2, String userId, String str) {
        o.LJIIIZ(userId, "userId");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = userId;
        if (str == null) {
            str = "";
        }
        aVTextExtraStruct.setSecUid(str);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createDuetStruct(int i, int i2, String userId, String awemeId) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(awemeId, "awemeId");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = userId;
        aVTextExtraStruct.awemeId = awemeId;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createQaStickerStruct(int i, int i2, String str, int i3) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = i3;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }
}
