package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.6Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC162426Za extends C0I6 {
    boolean A8();

    List<Effect> Dm0();

    void E5(IStsPrepareHelper iStsPrepareHelper, String str);

    IStsPrepareHelper Oq(Context context, String str);

    boolean P9();

    Effect YK(String str);

    void d30(MusicBuzModel musicBuzModel);

    void em(Context context, Integer num, int i);

    String iY(IStsPrepareHelper iStsPrepareHelper, StsRequestModel stsRequestModel, OnSpeechToSongPrepareListener onSpeechToSongPrepareListener);

    boolean t50(StsAssetModel stsAssetModel, boolean z, Long l);

    void xj(boolean z);

    Effect zT();
}
