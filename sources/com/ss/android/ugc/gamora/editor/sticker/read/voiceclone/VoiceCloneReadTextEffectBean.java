package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.C44423Hc3;
import X.C73098SmU;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VoiceCloneReadTextEffectBean extends ReadTextEffectBean {
    public boolean isPrivate;
    public boolean isRecordCompleted;
    public int requiredCount;
    public int succeedCount;
    public UrlModel userAvatar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCloneReadTextEffectBean(Effect mEffect, ReadTextEffectSpeakerExtra mSpeaker) {
        super(mEffect, mSpeaker);
        UrlModel urlModel;
        o.LJIIIZ(mEffect, "mEffect");
        o.LJIIIZ(mSpeaker, "mSpeaker");
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            urlModel = LJ.getAvatarThumb();
        } else {
            urlModel = null;
        }
        this.userAvatar = urlModel;
        this.isPrivate = true;
    }
}
