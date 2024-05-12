package X;

import Y.AUListenerS95S0100000_7;
import Y.IDAListenerS75S0100000_7;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnPreDrawListenerC45481Ht7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        View view = mvChoosePhotoScene.mView;
        if (view != null) {
            view.setTranslationY(mvChoosePhotoScene.LLLLIIL());
        }
        ValueAnimator startAnim = ValueAnimator.ofFloat(0.0f, 1.0f);
        List<ValueAnimator> list = mvChoosePhotoScene.LLZ;
        o.LJIIIIZZ(startAnim, "startAnim");
        ((ArrayList) list).add(startAnim);
        startAnim.setDuration(mvChoosePhotoScene.LLLZLL);
        boolean z = mvChoosePhotoScene.s;
        mvChoosePhotoScene.s = false;
        C173216qz.LJ(startAnim, "album_panel_enter", z);
        startAnim.addUpdateListener(new AUListenerS95S0100000_7(mvChoosePhotoScene, 1));
        startAnim.addListener(new IDAListenerS75S0100000_7(mvChoosePhotoScene, 1));
        startAnim.start();
        this.LJLILLLLZI.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC45481Ht7(MvChoosePhotoScene mvChoosePhotoScene, View view) {
        this.LJLIL = mvChoosePhotoScene;
        this.LJLILLLLZI = view;
    }
}
