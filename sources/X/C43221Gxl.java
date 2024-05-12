package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43221Gxl extends PagerAdapter {
    public final Context LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final InterfaceC88472Yns<AbstractC43208GxY, C76800UCe> LJLJJI;
    public InterfaceC45930I0w LJLJJL;
    public final List<VideoPublishEditModel> LJLJJLL;
    public final java.util.Map<Integer, C43222Gxm> LJLJL;
    public boolean LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj, "obj");
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    public final C43222Gxm LJJIII(int i) {
        return (C43222Gxm) ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        String LIZ;
        String str;
        o.LJIIIZ(container, "container");
        View child = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLILLLLZI), R.layout.bgk, container, false);
        container.addView(child);
        UrlModel urlModel = null;
        if (!this.LJLJL.containsKey(Integer.valueOf(i))) {
            o.LJIIIIZZ(child, "child");
            LifecycleOwner lifecycleOwner = this.LJLJI;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) ListProtector.get(this.LJLJJLL, i);
            InterfaceC45930I0w interfaceC45930I0w = this.LJLJJL;
            if (interfaceC45930I0w != null) {
                this.LJLJL.put(Integer.valueOf(i), new C43222Gxm(child, lifecycleOwner, videoPublishEditModel, interfaceC45930I0w, this.LJLJJI));
            } else {
                o.LJIJI("userData");
                throw null;
            }
        }
        C43222Gxm c43222Gxm = (C43222Gxm) ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(i));
        if (c43222Gxm != null) {
            boolean z = this.LJLJLJ;
            C16880lQ.LJIILLIIL(c43222Gxm.LJIILIIL, new ACListenerS27S0100000_7(c43222Gxm, 204));
            C8HD c8hd = c43222Gxm.LJIILJJIL;
            VideoPublishEditModel videoPublishEditModel2 = c43222Gxm.LIZJ;
            Context context = c43222Gxm.LIZ.getContext();
            o.LJI(context);
            InterfaceC45930I0w interfaceC45930I0w2 = c43222Gxm.LIZLLL;
            MusicObject musicObject = videoPublishEditModel2.creativeModel.musicBuzModel.music;
            if (musicObject == null || (LIZ = musicObject.musicName) == null) {
                LIZ = C29822Bn8.LIZ(context, R.string.jdk, "context.resources.getString(R.string.origin_music)");
            }
            MusicObject musicObject2 = videoPublishEditModel2.creativeModel.musicBuzModel.music;
            if (musicObject2 == null || (str = musicObject2.authorName) == null) {
                if (interfaceC45930I0w2 != null) {
                    str = interfaceC45930I0w2.getUniqueId();
                } else {
                    str = "";
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append('-');
            LIZ2.append(str);
            c8hd.setText(X1D.LIZIZ(LIZ2));
            MusicObject musicObject3 = c43222Gxm.LIZJ.creativeModel.musicBuzModel.music;
            if (musicObject3 != null) {
                urlModel = musicObject3.coverThumb;
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            int LJIILL = C17N.LJIILL(27.0d);
            int LJIILL2 = C17N.LJIILL(27.0d);
            LJII.LJII = LJIILL;
            LJII.LJIIIIZZ = LJIILL2;
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = c43222Gxm.LJIILL;
            C16880lQ.LLJJJ(LJII);
            c43222Gxm.LIZLLL();
            C78765Uvh.LJFF(c43222Gxm.LJIIL, c43222Gxm.LIZLLL.getAvatarMedium());
            TuxTextView tuxTextView = c43222Gxm.LJIJ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append('@');
            LIZ3.append(c43222Gxm.LIZLLL.getUniqueId());
            tuxTextView.setText(X1D.LIZIZ(LIZ3));
            if (!TextUtils.isEmpty(c43222Gxm.LIZJ.title)) {
                c43222Gxm.LJIJI.setVisibility(0);
                c43222Gxm.LJIJI.setText(c43222Gxm.LIZJ.title);
            }
            if (!z) {
                c43222Gxm.LIZ().LIZJ();
            }
        }
        this.LJLJLJ = false;
        o.LJIIIIZZ(child, "child");
        return child;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43221Gxl(Context context, LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super AbstractC43208GxY, C76800UCe> eventHandler) {
        o.LJIIIZ(eventHandler, "eventHandler");
        this.LJLILLLLZI = context;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = eventHandler;
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new LinkedHashMap();
        this.LJLJLJ = true;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object obj) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        if (this.LJLJL.containsKey(Integer.valueOf(i))) {
            C43222Gxm c43222Gxm = (C43222Gxm) ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(i));
            if (c43222Gxm != null) {
                c43222Gxm.LIZ().LIZIZ();
            }
            this.LJLJL.remove(Integer.valueOf(i));
        }
        C16880lQ.LJLLL((View) obj, container);
    }
}
