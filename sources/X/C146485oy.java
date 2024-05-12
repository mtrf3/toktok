package X;

import Y.ALAdapterS1S0100000_2;
import Y.IDAListenerS0S0110000_2;
import Y.IDTListenerS112S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146485oy extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJI;
    public final C82622Wbi LJLIL;
    public C29701Eo LJLILLLLZI;
    public final C82632Wbs LJLJI;

    static {
        TBT tbt = new TBT(C146485oy.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WM7
    public final void onPause() {
        View view = this.mView;
        o.LJIIIIZZ(view, "view");
        LLJILJIL(view, false);
        super.onPause();
    }

    @Override // X.WM7
    public final void onResume() {
        C29701Eo c29701Eo = this.LJLILLLLZI;
        if (c29701Eo != null) {
            c29701Eo.resumeAnimation();
        }
        super.onResume();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C146485oy(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        String str;
        super.onActivityCreated(bundle);
        C150745vq.LIZIZ();
        H8F.LJJJJ((VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJJI[0]), "obvious_hint");
        View view = this.mView;
        o.LJIIIIZZ(view, "view");
        LLJILJIL(view, true);
        this.mView.setOnTouchListener(new IDTListenerS112S0100000_2(this, 18));
        TextView textView = (TextView) this.mView.findViewById(R.id.e2a);
        Context context = this.mView.getContext();
        if (C68E.LIZ(this.mView.getContext())) {
            i = R.string.eil;
        } else {
            i = R.string.eik;
        }
        textView.setText(context.getString(i));
        C29701Eo c29701Eo = (C29701Eo) this.mView.findViewById(R.id.e2b);
        this.LJLILLLLZI = c29701Eo;
        if (c29701Eo != null) {
            c29701Eo.setRepeatCount(2);
            c29701Eo.setRepeatMode(1);
            if (C68E.LIZ(this.mView.getContext())) {
                str = "swipe_right_hint_photo_creation.json";
            } else {
                str = "swipe_left_hint_photo_creation.json";
            }
            c29701Eo.setAnimation(str);
            c29701Eo.addAnimatorListener(new ALAdapterS1S0100000_2(this, 52));
        }
    }

    public static void LLJILJIL(View view, boolean z) {
        float f;
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).setDuration(300L).setListener(new IDAListenerS0S0110000_2(view, z, 1)).start();
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.bzd, viewGroup, false, "inflater.inflate(layoutId, container, false)");
    }
}
