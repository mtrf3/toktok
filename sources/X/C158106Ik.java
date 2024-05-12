package X;

import Y.ARunnableS38S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158106Ik extends AbstractC56012Ht<C158146Io, C6PC> {
    public C6PV LJLIL;
    public FrameLayout LJLILLLLZI;
    public FrameLayout LJLJI;
    public QAStickerModel LJLJJI;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View findViewById = findViewById(R.id.iru);
        o.LJI(findViewById);
        this.LJLILLLLZI = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.irv);
        o.LJI(findViewById2);
        this.LJLJI = (FrameLayout) findViewById2;
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.post(new ARunnableS38S0100000_2(this, 43));
        } else {
            o.LJIJI("stickerContainer");
            throw null;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.bws, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
