package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokAlbumServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.ac2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94130ac2 implements HPI {
    public final /* synthetic */ TiktokAlbumServiceImpl LIZ;
    public final /* synthetic */ C94354afe LIZIZ;
    public final /* synthetic */ Fragment LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        Bundle chooseImageBundle = this.LIZ.getChooseImageBundle(this.LIZIZ);
        chooseImageBundle.putString("shoot_way", "");
        chooseImageBundle.putString("content_source", "cke");
        chooseImageBundle.putString("content_type", "");
        C77412UZs.LJJIJLIJ(chooseImageBundle, new CreativeInfo(null, 0, null, 7, null));
        Fragment fragment = this.LIZJ;
        int i = this.LIZLLL;
        o.LJIIIZ(fragment, "fragment");
        C16880lQ.LJII(fragment, HJ9.LIZIZ(fragment, chooseImageBundle, 10004, 10004), i);
    }

    public C94130ac2(TiktokAlbumServiceImpl tiktokAlbumServiceImpl, C94354afe c94354afe, Fragment fragment, int i) {
        this.LIZ = tiktokAlbumServiceImpl;
        this.LIZIZ = c94354afe;
        this.LIZJ = fragment;
        this.LIZLLL = i;
    }
}
