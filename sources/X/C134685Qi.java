package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134685Qi {
    public final InterfaceC126684y8 LIZ;
    public final EditorProContext LIZIZ;
    public SurfaceView LIZJ;
    public View LIZLLL;
    public Context LJ;
    public NLEModel LJFF;
    public InterfaceC134705Qk LJI;
    public InterfaceC134705Qk LJII;
    public InterfaceC88477Ynx<? super NLEModel, ? super FrameLayout, ? super java.util.Map<String, View>, ? super Long, ? super Float, ? super Float, ? super Float, C76800UCe> LJIIIIZZ;
    public InterfaceC88473Ynt<? super Long, ? super java.util.Map<String, ? extends View>, ? super NLEModel, C76800UCe> LJIIIZ;
    public InterfaceC65784Pro<Bitmap> LJIIJ;

    public final DialogC134805Qu LIZ() {
        FrameLayout frameLayout;
        ImageView imageView;
        ImageView imageView2;
        C87230YLi c87230YLi;
        C134825Qw c134825Qw;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Context context = this.LJ;
        if (context != null) {
            DialogC134805Qu dialogC134805Qu = new DialogC134805Qu(context, this.LIZ, this.LIZIZ);
            dialogC134805Qu.LJZ = this.LJIIIIZZ;
            dialogC134805Qu.LJZI = this.LJIIIZ;
            dialogC134805Qu.LJZL = this.LJIIJ;
            Context context2 = this.LJ;
            if (context2 != null) {
                Object LLILL = C16880lQ.LLILL(context2, "layout_inflater");
                o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
                dialogC134805Qu.LJLJL = C16880lQ.LLLZIIL(R.layout.amn, (LayoutInflater) LLILL, null);
                dialogC134805Qu.LJLJJI = this.LIZJ;
                NLEModel nLEModel = this.LJFF;
                if (nLEModel != null) {
                    dialogC134805Qu.LL = nLEModel;
                    dialogC134805Qu.LJLLILLLL = C5R0.LIZ(this.LIZLLL, nLEModel.getCanvasRatio());
                    View view = dialogC134805Qu.LJLJL;
                    if (view != null) {
                        dialogC134805Qu.setContentView(view);
                    }
                    View view2 = dialogC134805Qu.LJLJL;
                    if (view2 != null) {
                        frameLayout = (FrameLayout) view2.findViewById(R.id.bxm);
                    } else {
                        frameLayout = null;
                    }
                    dialogC134805Qu.LJLJLJ = frameLayout;
                    View view3 = dialogC134805Qu.LJLJL;
                    if (view3 != null) {
                        imageView = (ImageView) view3.findViewById(R.id.nge);
                    } else {
                        imageView = null;
                    }
                    dialogC134805Qu.LJLJLLL = imageView;
                    View view4 = dialogC134805Qu.LJLJL;
                    if (view4 != null) {
                        imageView2 = (ImageView) view4.findViewById(R.id.l5e);
                    } else {
                        imageView2 = null;
                    }
                    dialogC134805Qu.LJLL = imageView2;
                    View view5 = dialogC134805Qu.LJLJL;
                    if (view5 != null) {
                        c87230YLi = (C87230YLi) view5.findViewById(R.id.b8i);
                    } else {
                        c87230YLi = null;
                    }
                    dialogC134805Qu.LJLLI = c87230YLi;
                    FrameLayout frameLayout2 = dialogC134805Qu.LJLJLJ;
                    if (frameLayout2 != null) {
                        C134695Qj c134695Qj = new C134695Qj();
                        c134695Qj.LIZ = frameLayout2;
                        View findViewById = dialogC134805Qu.findViewById(R.id.dfv);
                        o.LJIIIIZZ(findViewById, "dialog.findViewById(R.id.fl_preview_surface)");
                        c134695Qj.LIZIZ = findViewById;
                        c134695Qj.LIZJ = 500L;
                        c134695Qj.LIZLLL = new C58V();
                        View view6 = c134695Qj.LIZ;
                        if (view6 != null) {
                            long j = c134695Qj.LIZJ;
                            View view7 = c134695Qj.LIZIZ;
                            if (view7 != null) {
                                c134825Qw = new C134825Qw(view6, j, view7, c134695Qj.LIZLLL);
                            } else {
                                o.LJIJI("targetView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("animView");
                            throw null;
                        }
                    } else {
                        c134825Qw = null;
                    }
                    dialogC134805Qu.LJLLJ = c134825Qw;
                    InterfaceC134705Qk interfaceC134705Qk = this.LJI;
                    if (interfaceC134705Qk == null) {
                        Context context3 = this.LJ;
                        if (context3 != null) {
                            NLEModel nLEModel2 = this.LJFF;
                            if (nLEModel2 != null) {
                                dialogC134805Qu.LJLLLLLL = new AnonymousClass581(context3, nLEModel2);
                            } else {
                                o.LJIJI("nleModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("context");
                            throw null;
                        }
                    } else {
                        dialogC134805Qu.LJLLLLLL = interfaceC134705Qk;
                    }
                    InterfaceC134705Qk interfaceC134705Qk2 = dialogC134805Qu.LJLLLLLL;
                    if (interfaceC134705Qk2 != null) {
                        interfaceC134705Qk2.LLLLLZ(dialogC134805Qu);
                        interfaceC134705Qk2.onCreate();
                        View view8 = interfaceC134705Qk2.getView();
                        if (view8 != null) {
                            ViewParent parent = view8.getParent();
                            if (parent instanceof ViewGroup) {
                                C16880lQ.LJLLL(view8, (ViewGroup) parent);
                            }
                            View view9 = dialogC134805Qu.LJLJL;
                            if (view9 != null && (viewGroup2 = (ViewGroup) view9.findViewById(R.id.buy)) != null) {
                                viewGroup2.addView(view8);
                            }
                        }
                    }
                    InterfaceC134705Qk interfaceC134705Qk3 = this.LJII;
                    if (interfaceC134705Qk3 != null) {
                        dialogC134805Qu.LJLLLL = interfaceC134705Qk3;
                        interfaceC134705Qk3.LLLLLZ(dialogC134805Qu);
                        interfaceC134705Qk3.onCreate();
                        View view10 = interfaceC134705Qk3.getView();
                        if (view10 != null) {
                            ViewParent parent2 = view10.getParent();
                            if (parent2 instanceof ViewGroup) {
                                C16880lQ.LJLLL(view10, (ViewGroup) parent2);
                            }
                            View view11 = dialogC134805Qu.LJLJL;
                            if (view11 != null && (viewGroup = (ViewGroup) view11.findViewById(R.id.kul)) != null) {
                                viewGroup.addView(view10);
                            }
                        }
                    }
                    return dialogC134805Qu;
                }
                o.LJIJI("nleModel");
                throw null;
            }
            o.LJIJI("context");
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }

    public C134685Qi(InterfaceC126684y8 mediaSession, EditorProContext editorContext) {
        o.LJIIIZ(mediaSession, "mediaSession");
        o.LJIIIZ(editorContext, "editorContext");
        this.LIZ = mediaSession;
        this.LIZIZ = editorContext;
    }
}
