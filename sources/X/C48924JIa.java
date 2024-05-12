package X;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import v82.IDdS501S0100000_8;

/* renamed from: X.JIa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48924JIa extends JJW {
    public final Object LJLIL;
    public final C73062Slu LJLILLLLZI;
    public final C46578IPu LJLJI;
    public Aweme LJLJJI;
    public C27606AsU LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C48926JIc LJLJL;

    @Override // X.JJW
    public final void onViewAttachedToWindow() {
        this.LJLILLLLZI.LJIIIIZZ();
    }

    @Override // X.JJW
    public final void onViewDetachedFromWindow() {
        this.LJLILLLLZI.LJFF(false);
        this.LJLILLLLZI.LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JJW
    public final void L(JJZ jjz) {
        DialogFragment dialogFragment;
        Window window;
        ViewGroup viewGroup;
        Window window2;
        ViewGroup viewGroup2;
        View findViewById = this.itemView.findViewById(R.id.hst);
        o.LJIIIIZZ(findViewById, "itemView.player_view_v2");
        findViewById.setVisibility(8);
        Aweme LIZIZ = ((KJR) jjz).LIZIZ();
        this.LJLJJI = LIZIZ;
        Video video = LIZIZ.getVideo();
        if (video != null) {
            C46578IPu c46578IPu = this.LJLJI;
            if (c46578IPu != null) {
                c46578IPu.LJ = video;
                c46578IPu.LJFF = 0;
                Aweme aweme = this.LJLJJI;
                IWF iwf = c46578IPu.LJII;
                if (iwf != null) {
                    iwf.LJJIZ(aweme, null);
                }
                new C27606AsU();
                C27606AsU c27606AsU = new C27606AsU();
                C46578IPu c46578IPu2 = this.LJLJI;
                if (c46578IPu2 != null) {
                    c27606AsU.LIZ = c46578IPu2;
                    c27606AsU.LIZLLL = new C73043Slb(video.getWidth(), video.getHeight());
                    c27606AsU.LJ = Integer.valueOf(video.getVideoLength());
                    c27606AsU.LJI = this.LJLJL;
                    this.LJLJJL = c27606AsU;
                    Object obj = this.LJLIL;
                    if (obj instanceof Fragment) {
                        ActivityC45651qj mo49getActivity = ((Fragment) obj).mo49getActivity();
                        if (mo49getActivity != null) {
                            window2 = mo49getActivity.getWindow();
                        } else {
                            window2 = null;
                        }
                        c27606AsU.LIZJ = window2;
                        C27606AsU c27606AsU2 = this.LJLJJL;
                        if (c27606AsU2 != null) {
                            ActivityC45651qj mo49getActivity2 = ((Fragment) this.LJLIL).mo49getActivity();
                            if (mo49getActivity2 != null) {
                                viewGroup2 = (ViewGroup) mo49getActivity2.findViewById(android.R.id.content);
                            } else {
                                viewGroup2 = null;
                            }
                            c27606AsU2.LIZIZ = viewGroup2;
                        }
                    } else if (obj instanceof Dialog) {
                        Dialog dialog = (Dialog) obj;
                        if (dialog != null) {
                            c27606AsU.LIZJ = dialog.getWindow();
                            C27606AsU c27606AsU3 = this.LJLJJL;
                            if (c27606AsU3 != null) {
                                c27606AsU3.LIZIZ = (ViewGroup) dialog.findViewById(android.R.id.content);
                            }
                        }
                    } else if ((obj instanceof DialogFragment) && (dialogFragment = (DialogFragment) obj) != null) {
                        Dialog dialog2 = dialogFragment.getDialog();
                        if (dialog2 != null) {
                            window = dialog2.getWindow();
                        } else {
                            window = null;
                        }
                        c27606AsU.LIZJ = window;
                        C27606AsU c27606AsU4 = this.LJLJJL;
                        if (c27606AsU4 != null) {
                            Dialog dialog3 = dialogFragment.getDialog();
                            if (dialog3 != null) {
                                viewGroup = (ViewGroup) dialog3.findViewById(android.R.id.content);
                            } else {
                                viewGroup = null;
                            }
                            c27606AsU4.LIZIZ = viewGroup;
                        }
                    }
                    W5F LJII = W5U.LJII(C78939UyV.LJ(video.getCover()));
                    LJII.LIZJ = this.itemView.getContext();
                    LJII.LJIJI = Bitmap.Config.ARGB_8888;
                    LJII.LJIIIZ(new IDdS501S0100000_8(this, 1));
                    this.LJLILLLLZI.setParams(this.LJLJJL);
                    if (video.getVideoLength() <= 0) {
                        C46578IPu c46578IPu3 = this.LJLJI;
                        if (c46578IPu3 != null) {
                            Object uiPlayListener = this.LJLJJLL.getValue();
                            o.LJIIIZ(uiPlayListener, "uiPlayListener");
                            c46578IPu3.LIZLLL().add(uiPlayListener);
                            return;
                        }
                        o.LJIJI("playerController");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("playerController");
                throw null;
            }
            o.LJIJI("playerController");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48924JIa(C71510S4s c71510S4s, Object container) {
        super(c71510S4s);
        o.LJIIIZ(container, "container");
        this.LJLIL = container;
        View findViewById = c71510S4s.findViewById(R.id.player_view);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.player_view)");
        C73062Slu c73062Slu = (C73062Slu) findViewById;
        this.LJLILLLLZI = c73062Slu;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 16));
        this.LJLJL = new C48926JIc(this);
        this.LJLJI = new C46578IPu(c73062Slu);
    }
}
