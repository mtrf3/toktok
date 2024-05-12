package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes16.dex */
public interface XZI {
    boolean A8();

    void E5(IStsPrepareHelper iStsPrepareHelper, String str);

    VideoPublishEditModel LLLLIL();

    boolean P9();

    void Q9(List<? extends MusicModel> list);

    C149795uJ R9();

    String S9(IStsPrepareHelper iStsPrepareHelper, StsRequestModel stsRequestModel, XZB xzb);

    boolean T9(StsAssetModel stsAssetModel, long j);

    void U9(Context context, Integer num);

    boolean V9();

    IStsPrepareHelper W9(ActivityC45651qj activityC45651qj);

    MusicModel X9(MusicModel musicModel);

    Effect Y9();

    InterfaceC149485to Z9();

    Effect aa(String str);
}
