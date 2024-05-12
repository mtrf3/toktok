package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Oe0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62380Oe0 implements InterfaceC62382Oe2 {
    @Override // X.InterfaceC62382Oe2
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        Music music;
        String str;
        Bundle bundle;
        ShareModel shareModel;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        Serializable serializable = null;
        if (baseSharePackage != null && (shareModel = baseSharePackage.shareModel) != null) {
            serializable = shareModel.customModel;
        }
        if (!(serializable instanceof Music) || (music = (Music) serializable) == null) {
            return;
        }
        if (baseSharePackage == null || (bundle = baseSharePackage.extras) == null || (str = bundle.getString("process_id")) == null) {
            str = "";
        }
        String mid = music.getMid();
        o.LJIIIIZZ(mid, "music.mid");
        C62395OeF.LJFF(mid, channel.key(), str);
        String mid2 = music.getMid();
        o.LJIIIIZZ(mid2, "music.mid");
        C62395OeF.LJI(mid2, channel.key(), z);
    }
}
