package X;

import Y.ACListenerS22S0100000_2;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6AL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AL {
    public final ViewGroup LIZ;
    public final EditCaptionScene LIZIZ;
    public final C6AA LIZJ;
    public final RecyclerView LIZLLL;
    public InterfaceC156026Ak LJ;
    public final C62822Ol8 LJFF;
    public final InputMethodManager LJI;
    public final C83547Wqd LJII;
    public final TextView LJIIIIZZ;
    public C152515yh LJIIIZ;
    public final C82949Wgz LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public final ArrayList<CaptionUtterance> LJIILJJIL;
    public final ArrayList<CaptionUtterance> LJIILL;
    public boolean LJIILLIIL;

    public final void LIZ(final C82949Wgz c82949Wgz) {
        if (this.LJIILLIIL) {
            this.LJII.LIZIZ(new InterfaceC83564Wqu() { // from class: X.6AX
                @Override // X.InterfaceC83564Wqu
                public final void keyBoardModify(int i) {
                }

                @Override // X.InterfaceC83564Wqu
                public final void keyBoardShow(int i) {
                }

                @Override // X.InterfaceC83564Wqu
                public final void keyBoardHide(int i) {
                    C82949Wgz c82949Wgz2 = C82949Wgz.this;
                    final C6AL c6al = this;
                    c82949Wgz2.LIZJ(new C30461Hm() { // from class: X.6AV
                        @Override // X.C30461Hm, X.InterfaceC82947Wgx
                        public final void LJ() {
                        }

                        @Override // X.C30461Hm, X.InterfaceC82947Wgx
                        public final void LJII() {
                            C6AL c6al2 = C6AL.this;
                            c6al2.LJIIL = false;
                            c6al2.LJII.LIZ();
                            C6AL c6al3 = C6AL.this;
                            InterfaceC156026Ak interfaceC156026Ak = c6al3.LJ;
                            if (interfaceC156026Ak != null) {
                                interfaceC156026Ak.LJJIZ(c6al3.LJIILIIL);
                            }
                            C6AL c6al4 = C6AL.this;
                            C152515yh c152515yh = c6al4.LJIIIZ;
                            if (c152515yh != null) {
                                RecyclerView recyclerView = c6al4.LIZLLL;
                                o.LJI(c152515yh);
                                recyclerView.LJJLIL(c152515yh);
                                C6AL.this.LJIIIZ = null;
                            }
                        }
                    });
                    this.LJIILLIIL = false;
                }
            });
            View currentFocus = ((Activity) this.LJFF.getValue()).getCurrentFocus();
            if (currentFocus != null) {
                this.LJI.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        } else {
            c82949Wgz.LIZJ(new C30461Hm() { // from class: X.6AU
                @Override // X.C30461Hm, X.InterfaceC82947Wgx
                public final void LJ() {
                }

                @Override // X.C30461Hm, X.InterfaceC82947Wgx
                public final void LJII() {
                    C6AL c6al = C6AL.this;
                    c6al.LJIIL = false;
                    c6al.LJII.LIZ();
                    C6AL c6al2 = C6AL.this;
                    InterfaceC156026Ak interfaceC156026Ak = c6al2.LJ;
                    if (interfaceC156026Ak != null) {
                        interfaceC156026Ak.LJJIZ(c6al2.LJIILIIL);
                    }
                    C6AL c6al3 = C6AL.this;
                    C152515yh c152515yh = c6al3.LJIIIZ;
                    if (c152515yh != null) {
                        RecyclerView recyclerView = c6al3.LIZLLL;
                        o.LJI(c152515yh);
                        recyclerView.LJJLIL(c152515yh);
                        C6AL.this.LJIIIZ = null;
                    }
                }
            });
        }
        this.LIZJ.LJLLLLLL();
    }

    public C6AL(LinearLayout linearLayout, ViewGroup viewGroup, EditCaptionScene scene, VideoPublishEditModel mModel, InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LIZ = viewGroup;
        this.LIZIZ = scene;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 708));
        this.LJFF = LIZIZ;
        this.LJIIJJI = "";
        this.LJIILJJIL = new ArrayList<>();
        this.LJIILL = new ArrayList<>();
        Object LLILLJJLI = C16880lQ.LLILLJJLI((ActivityC45651qj) LIZIZ.getValue(), "input_method");
        o.LJII(LLILLJJLI, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.LJI = (InputMethodManager) LLILLJJLI;
        C6AA c6aa = new C6AA(this, mModel, editPreviewApi);
        this.LIZJ = c6aa;
        View findViewById = linearLayout.findViewById(R.id.cpj);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        linearLayout.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(c6aa);
        recyclerView.LJII(new C152515yh((int) KL2.LIZJ(recyclerView.getContext(), 0.0f), (int) KL2.LIZJ(recyclerView.getContext(), 40.0f)), -1);
        recyclerView.setItemAnimator(null);
        o.LJIIIIZZ(findViewById, "editCaptionLayout.findVi…Animator = null\n        }");
        this.LIZLLL = (RecyclerView) findViewById;
        TextView textView = (TextView) linearLayout.findViewById(R.id.b3n);
        this.LJIIIIZZ = textView;
        this.LJIIJ = new C82949Wgz(viewGroup, viewGroup.findViewById(R.id.ks8), linearLayout);
        o.LJI(textView);
        C16880lQ.LJIJI(textView, new ACListenerS22S0100000_2(this, 101));
        C16880lQ.LJIJI((TextView) linearLayout.findViewById(R.id.kug), new ACListenerS22S0100000_2(this, 102));
        this.LJII = C78866UxK.LJIIJ((Activity) LIZIZ.getValue());
    }
}
