package com.ss.android.ugc.aweme.choosemusic.cutpanel;

import X.ASL;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C06460Ne;
import X.C0EH;
import X.C118234kV;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C26338AVi;
import X.C40517FvF;
import X.C71897SJp;
import X.C78929UyL;
import X.C79045V0n;
import X.C82190WNm;
import X.C82191WNn;
import X.C82193WNp;
import X.C90193gN;
import X.FMX;
import X.H7B;
import X.InterfaceC82187WNj;
import X.KL2;
import X.L7Q;
import X.O6R;
import X.W1W;
import X.WG6;
import X.WG7;
import X.WG9;
import X.WGA;
import X.WGE;
import X.WGI;
import X.WGJ;
import X.WGK;
import X.WGL;
import X.WGM;
import X.WGN;
import X.WGO;
import X.X1D;
import X.XVC;
import X.XVD;
import Y.ACListenerS34S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDCListenerS288S0100000_14;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class CutMusicPanel extends Fragment implements InterfaceC82187WNj {
    public FrameLayout LJLILLLLZI;
    public View LJLJI;
    public Boolean LJLJJI;
    public ActivityC45651qj LJLJJL;
    public TuxSheet LJLJJLL;
    public ASL LJLJL;
    public WG7 LJLJLJ;
    public View LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxTextView LJLLL;
    public TuxTextView LJLLLL;
    public TuxTextView LJLLLLLL;
    public TuxTextView LJLZ;
    public ViewStub LJZ;
    public View LJZI;
    public View LJZL;
    public View LL;
    public View LLD;
    public View LLF;
    public View LLFF;
    public boolean LLFFF;
    public TuxTextView LLFII;
    public C71897SJp LLFZ;
    public View LLI;
    public View LLIFFJFJJ;
    public View LLII;
    public View LLIIII;
    public float LLIIIILZ;
    public Boolean LLIIIJ;
    public final float[] LLIIIL;
    public W1W LLIIIZ;
    public boolean LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public Boolean LLIILII;
    public Boolean LLIILZL;
    public float LLIIZ;
    public XVD LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public WGL LLILL;
    public WGM LLILLIZIL;
    public WGN LLILLJJLI;
    public WGO LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final String LLILZLL;
    public final float LLIZ;
    public final Map<Integer, View> LLIZLLLIL = new LinkedHashMap();
    public boolean LJLIL = true;

    public static int Dl(float f) {
        if (f == 0.5f) {
            return 0;
        }
        if (f == 0.75f) {
            return 1;
        }
        if (f == 1.0f) {
            return 2;
        }
        if (f == 1.25f) {
            return 3;
        }
        if (f == 1.5f) {
            return 4;
        }
        return f == 2.0f ? 5 : 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
    }

    @Override // X.InterfaceC82187WNj
    public final void t1() {
        this.LLILZIL = true;
    }

    public final void vl() {
        this.LLILZ = false;
        if (o.LJ(this.LLIIIJ, Boolean.TRUE)) {
            TuxSheet tuxSheet = this.LJLJJLL;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
            WGL wgl = this.LLILL;
            if (wgl != null) {
                wgl.LIZ();
                return;
            }
            return;
        }
        TuxSheet tuxSheet2 = this.LJLJJLL;
        if (tuxSheet2 != null) {
            tuxSheet2.dismiss();
        }
        WGL wgl2 = this.LLILL;
        if (wgl2 == null) {
            return;
        }
        wgl2.LIZIZ();
    }

    public CutMusicPanel() {
        Boolean bool = Boolean.FALSE;
        this.LJLJJI = bool;
        this.LLFFF = true;
        this.LLIIIILZ = 1.0f;
        this.LLIIIJ = bool;
        this.LLIIIL = new float[]{0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
        this.LLIIJI = true;
        this.LLIIJLIL = -1;
        this.LLIIL = 2;
        this.LLIILII = bool;
        this.LLIILZL = bool;
        this.LLIIZ = 1.0f;
        this.LLILII = true;
        this.LLILZLL = "CutMusicPanel:";
        this.LLIZ = 207.0f;
    }

    @Override // X.InterfaceC82187WNj
    public final int W1() {
        WG7 wg7 = this.LJLJLJ;
        if (wg7 != null) {
            return wg7.getMaxCntOnScreen();
        }
        o.LJIJI("cutMusicScrollView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View getView() {
        View view = this.LJLJLLL;
        if (view != null) {
            return view;
        }
        o.LJIJI("cutMusicPanelView");
        throw null;
    }

    @Override // X.InterfaceC82187WNj
    public final FrameLayout mc() {
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("soundFilterFramelayout");
        throw null;
    }

    @Override // X.InterfaceC82187WNj
    public final void v7() {
        W1W w1w = this.LLIIIZ;
        if (w1w != null) {
            int i = w1w.LJLIL;
            if (i != -1) {
                w1w.LIZ(w1w.LJLJJL, w1w.LJLJLLL.getChildAt(i));
                w1w.LJLJLLL.getChildAt(w1w.LJLIL).setBackgroundResource(R.drawable.v_);
            }
            w1w.LJLIL = -1;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIZLLLIL).clear();
    }

    @Override // X.InterfaceC82187WNj
    public final void Ak(boolean z) {
        this.LLILII = z;
    }

    public final float Al(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return this.LLIIIILZ;
                            }
                            return 2.0f;
                        }
                        return 1.5f;
                    }
                    return 1.25f;
                }
                return 1.0f;
            }
            return 0.75f;
        }
        return 0.5f;
    }

    @Override // X.InterfaceC82187WNj
    public final void C(C82193WNp c82193WNp) {
        this.LLILLL = c82193WNp;
    }

    @Override // X.InterfaceC82187WNj
    public final void Fj(boolean z) {
        this.LLILIL = z;
    }

    public final void Gl(int i) {
        String LLLZI;
        int LJJIIZ = O6R.LJJIIZ(i / 1000.0f);
        int i2 = LJJIIZ % 60;
        int i3 = LJJIIZ / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            LLLZI = C16880lQ.LLLZI(Locale.CHINA, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
        } else {
            LLLZI = C16880lQ.LLLZI(Locale.CHINA, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
        }
        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(LLLZI);
    }

    @Override // X.InterfaceC82187WNj
    public final void Hb(C82191WNn c82191WNn) {
        this.LLILLJJLI = c82191WNn;
    }

    public final void Hl(boolean z) {
        this.LJLJJI = Boolean.TRUE;
        View view = this.LLF;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LLII;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (this.LLILII && !this.LLILIL) {
            View view3 = this.LJLJI;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.LJLJI;
            if (view4 != null) {
                view4.post(new ARunnableS50S0100000_14(this, 56));
            }
        } else {
            View view5 = this.LJLJI;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.LLII;
            if (view6 != null) {
                ActivityC45651qj activityC45651qj = this.LJLJJL;
                if (activityC45651qj != null) {
                    view6.setPaddingRelative(0, 0, 0, (int) KL2.LIZJ(activityC45651qj, 24.0f));
                } else {
                    o.LJIJI("mContext");
                    throw null;
                }
            }
        }
        if (z) {
            XVD xvd = this.LLIL;
            if (xvd != null) {
                C188727au c188727au = new C188727au();
                XVC.LIZ(c188727au, xvd);
                FMX.LJIIL("click_sound_remix", c188727au.LIZ);
                return;
            }
            o.LJIJI("mInfo");
            throw null;
        }
    }

    @Override // X.InterfaceC82187WNj
    public final void I5(float f) {
        this.LLIIZ = (float) (O6R.LJJIIJZLJL(f * 100.0d) / 100.0d);
    }

    @Override // X.InterfaceC82187WNj
    public final void d8(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC82187WNj
    public final void f5(WGL wgl) {
        this.LLILL = wgl;
    }

    @Override // X.InterfaceC82187WNj
    public final void kb(XVD xvd) {
        this.LLIL = xvd;
    }

    @Override // X.InterfaceC82187WNj
    public final void r(boolean z) {
        this.LLIILZL = Boolean.valueOf(z);
    }

    @Override // X.InterfaceC82187WNj
    public final void rb(C82190WNm c82190WNm) {
        this.LLILLIZIL = c82190WNm;
    }

    @Override // X.InterfaceC82187WNj
    public final void v6(FrameLayout frameLayout) {
        this.LJLILLLLZI = frameLayout;
    }

    @Override // X.InterfaceC82187WNj
    public final void wb(boolean z) {
        this.LLIIJI = z;
    }

    public final void wl(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.LLIIIJ = Boolean.valueOf(z);
        View view = this.LLF;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        View view2 = this.LLIIII;
        if (view2 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        View view3 = this.LLFF;
        if (view3 != null) {
            if (z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view3.setVisibility(i3);
        }
        TuxTextView tuxTextView = this.LJLLILLLL;
        if (tuxTextView != null) {
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            tuxTextView.setVisibility(i4);
        }
        TuxTextView tuxTextView2 = this.LJLLJ;
        if (tuxTextView2 != null) {
            if (z) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            tuxTextView2.setVisibility(i5);
        }
        View view4 = this.LLII;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = this.LJLJI;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        if (z) {
            ASL asl = this.LJLJL;
            if (asl != null) {
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LLD = true;
                tuxSheet.LJLLLLLL = -1;
                View view6 = this.LJZI;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                View view7 = this.LJZL;
                if (view7 != null) {
                    view7.setBackgroundColor(0);
                }
                View view8 = this.LJZL;
                if (view8 != null) {
                    view8.setBackgroundResource(R.drawable.c14);
                }
                if (o.LJ(this.LJLJJI, Boolean.TRUE)) {
                    View view9 = this.LLII;
                    if (view9 != null) {
                        view9.setVisibility(0);
                    }
                    View view10 = this.LJLJI;
                    if (view10 == null) {
                        return;
                    }
                    view10.setVisibility(0);
                    return;
                }
                return;
            }
            o.LJIJI("mSheetBuilder");
            throw null;
        }
        ASL asl2 = this.LJLJL;
        if (asl2 != null) {
            asl2.LIZ.LLD = false;
            ActivityC45651qj activityC45651qj = this.LJLJJL;
            if (activityC45651qj != null) {
                asl2.LIZ.LJLLLLLL = (int) KL2.LIZJ(activityC45651qj, this.LLIZ);
                View view11 = this.LJZL;
                if (view11 != null) {
                    view11.setBackgroundResource(0);
                }
                View view12 = this.LJZL;
                if (view12 != null) {
                    view12.setBackgroundColor(this.LLIIJLIL);
                }
                View view13 = this.LJZI;
                if (view13 == null) {
                    return;
                }
                view13.setVisibility(0);
                return;
            }
            o.LJIJI("mContext");
            throw null;
        }
        o.LJIJI("mSheetBuilder");
        throw null;
    }

    @Override // X.InterfaceC82187WNj
    public final void x0(FragmentManager fragmentManager) {
        Lifecycle lifecycle;
        if (this.LLILZ) {
            return;
        }
        if (this.LJLJJLL == null) {
            ASL asl = this.LJLJL;
            if (asl != null) {
                this.LJLJJLL = asl.LIZ;
            } else {
                o.LJIJI("mSheetBuilder");
                throw null;
            }
        }
        TuxSheet tuxSheet = this.LJLJJLL;
        if (tuxSheet != null && (lifecycle = tuxSheet.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel$show$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        onResume(lifecycleOwner);
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume(LifecycleOwner owner) {
                    o.LJIIIZ(owner, "owner");
                    CutMusicPanel cutMusicPanel = CutMusicPanel.this;
                    C71897SJp c71897SJp = cutMusicPanel.LLFZ;
                    if (c71897SJp == null) {
                        return;
                    }
                    c71897SJp.setChecked(cutMusicPanel.LJLIL);
                }
            });
        }
        if (MusicService.LJJLIIIJJI().LJJIJIIJIL() == 1) {
            if (MusicService.LJJLIIIJJI().LJJLIIIJ() == 0 || this.LLILZIL) {
                wl(false);
            } else if (MusicService.LJJLIIIJJI().LJJLIIIJ() == 1 || MusicService.LJJLIIIJJI().LJJLIIIJ() == 3) {
                if (MusicService.LJJLIIIJJI().LJJJJLI() == 1) {
                    wl(true);
                } else if (MusicService.LJJLIIIJJI().LJJJJLI() == 2) {
                    Hl(false);
                    wl(true);
                } else {
                    wl(false);
                }
            } else if (MusicService.LJJLIIIJJI().LJJLIIIJ() == 2) {
                if (MusicService.LJJLIIIJJI().LJJJJLI() == 1) {
                    if (this.LLIIJI) {
                        wl(true);
                    } else {
                        wl(false);
                    }
                } else if (MusicService.LJJLIIIJJI().LJJJJLI() == 2) {
                    if (this.LLIIJI) {
                        Hl(false);
                        wl(true);
                    } else {
                        wl(false);
                    }
                } else {
                    wl(false);
                }
            }
            Boolean bool = this.LJLJJI;
            Boolean bool2 = Boolean.TRUE;
            if (o.LJ(bool, bool2) && o.LJ(this.LLIIIJ, bool2)) {
                Hl(false);
            }
            if (o.LJ(this.LLIILII, bool2)) {
                wl(false);
            }
            if (o.LJ(this.LLIILZL, bool2)) {
                wl(false);
            }
            float f = this.LLIIZ;
            float xl = xl(this.LLIIIL, f);
            float xl2 = xl(this.LLIIIL, this.LLIIIILZ);
            this.LLIIL = Dl(xl);
            W1W w1w = this.LLIIIZ;
            if (w1w != null) {
                int Dl = Dl(xl2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(xl2);
                LIZ.append('x');
                w1w.LIZIZ(Dl, X1D.LIZIZ(LIZ));
            }
            W1W w1w2 = this.LLIIIZ;
            if (w1w2 != null) {
                int Dl2 = Dl(xl2);
                w1w2.LIZ(w1w2.LJLJJL, w1w2.LJLJLLL.getChildAt(Dl2));
                w1w2.LJLJLLL.getChildAt(Dl2).setBackgroundResource(R.drawable.v_);
            }
            W1W w1w3 = this.LLIIIZ;
            if (w1w3 != null) {
                int Dl3 = Dl(xl);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(f);
                LIZ2.append('x');
                w1w3.LIZIZ(Dl3, X1D.LIZIZ(LIZ2));
            }
            W1W w1w4 = this.LLIIIZ;
            if (w1w4 != null) {
                int i = this.LLIIL;
                w1w4.LJLIL = i;
                w1w4.LIZ(w1w4.LJLJJLL, w1w4.LJLJLLL.getChildAt(i));
                w1w4.LJLJLLL.getChildAt(i).setBackgroundResource(R.drawable.v8);
            }
            this.LLIIIILZ = this.LLIIZ;
        } else {
            wl(false);
        }
        this.LLILZ = true;
        TuxSheet tuxSheet2 = this.LJLJJLL;
        if (tuxSheet2 != null) {
            tuxSheet2.show(fragmentManager, "cutMusicPanel");
        }
    }

    public static float xl(float[] fArr, float f) {
        o.LJIIIZ(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f2 = fArr[0];
        int length = fArr.length - 1;
        if (length != 0) {
            float abs = Math.abs(f - f2);
            C118234kV it = new C40517FvF(1, length).iterator();
            while (it.LJLJI) {
                float f3 = fArr[it.nextInt()];
                float abs2 = Math.abs(f - f3);
                if (Float.compare(abs, abs2) > 0) {
                    f2 = f3;
                    abs = abs2;
                }
            }
        }
        return f2;
    }

    @Override // X.InterfaceC82187WNj
    public final void LLLLLLZZ(float f, boolean z) {
        WG7 wg7 = this.LJLJLJ;
        if (wg7 != null) {
            WG9 wg9 = wg7.LLLF;
            if (wg9 != null) {
                wg9.LJLJJL = (int) wg7.LLLFFI;
                wg9.LJLJI = f;
                wg9.invalidate();
                return;
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
        o.LJIJI("cutMusicScrollView");
        throw null;
    }

    @Override // X.InterfaceC82187WNj
    public final void Wh(float f, int i, boolean z) {
        Gl(i);
        WG7 wg7 = this.LJLJLJ;
        if (wg7 != null) {
            wg7.post(new WG6(wg7, f, z));
        } else {
            o.LJIJI("cutMusicScrollView");
            throw null;
        }
    }

    @Override // X.InterfaceC82187WNj
    public final void Qj(ActivityC45651qj activityC45651qj, LayoutInflater inflater, ViewGroup container, L7Q theme) {
        int i;
        WGJ wgj;
        int i2;
        GradientDrawable.Orientation orientation;
        GradientDrawable.Orientation orientation2;
        View inflate;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(theme, "theme");
        this.LJLJJL = activityC45651qj;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bit, container, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…_music, container, false)");
        this.LJLJLLL = LLLLIILL;
        ASL asl = new ASL();
        View view = this.LJLJLLL;
        W1W w1w = null;
        if (view != null) {
            asl.LIZ(view);
            asl.LIZ.LJLLJ = true;
            asl.LJI(1);
            if (theme == L7Q.DARK || theme == L7Q.CONST) {
                i = R.style.uw;
            } else {
                i = R.style.ul;
            }
            asl.LIZLLL(i);
            this.LJLJL = asl;
            ActivityC45651qj activityC45651qj2 = this.LJLJJL;
            if (activityC45651qj2 != null) {
                Integer LJI = C79045V0n.LJI(R.attr.d_, activityC45651qj2);
                if (theme == L7Q.CONST && LJI != null) {
                    ASL asl2 = this.LJLJL;
                    if (asl2 != null) {
                        asl2.LIZ.LJLJL = LJI;
                    } else {
                        o.LJIJI("mSheetBuilder");
                        throw null;
                    }
                }
                MusicService.LJJLIIIJJI().LJJIJIIJIL();
                View view2 = this.LJLJLLL;
                if (view2 != null) {
                    this.LJLL = (TuxTextView) view2.findViewById(R.id.m43);
                    this.LJLLI = (TuxTextView) view2.findViewById(R.id.m45);
                    this.LJLLILLLL = (TuxTextView) view2.findViewById(R.id.mjl);
                    this.LJLLJ = (TuxTextView) view2.findViewById(R.id.mjm);
                    View findViewById = view2.findViewById(R.id.c2z);
                    o.LJIIIIZZ(findViewById, "it.findViewById(R.id.cut_music_scroll_view)");
                    this.LJLJLJ = (WG7) findViewById;
                    this.LJLLLL = (TuxTextView) view2.findViewById(R.id.m42);
                    this.LJLLL = (TuxTextView) view2.findViewById(R.id.m41);
                    this.LJZI = view2.findViewById(R.id.kd2);
                    this.LJZL = view2.findViewById(R.id.c31);
                    this.LL = view2.findViewById(R.id.c30);
                    this.LLD = view2.findViewById(R.id.c2y);
                    this.LLF = view2.findViewById(R.id.k7q);
                    this.LJLLLLLL = (TuxTextView) view2.findViewById(R.id.k7x);
                    this.LJLZ = (TuxTextView) view2.findViewById(R.id.k7m);
                    view2.findViewById(R.id.k7s);
                    this.LJZ = (ViewStub) view2.findViewById(R.id.k7u);
                    this.LLFF = view2.findViewById(R.id.c2w);
                    this.LLFII = (TuxTextView) view2.findViewById(R.id.hqg);
                    this.LLI = view2.findViewById(R.id.hqf);
                    this.LLFZ = (C71897SJp) view2.findViewById(R.id.hqe);
                    this.LLIFFJFJJ = view2.findViewById(R.id.k7y);
                    this.LLII = view2.findViewById(R.id.k7v);
                    this.LLIIII = view2.findViewById(R.id.bb0);
                    View findViewById2 = view2.findViewById(R.id.k7k);
                    o.LJIIIIZZ(findViewById2, "it.findViewById(R.id.sound_filter_container)");
                    this.LJLILLLLZI = (FrameLayout) findViewById2;
                    this.LJLJI = view2.findViewById(R.id.k7l);
                    View view3 = this.LLFF;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    ViewStub viewStub = this.LJZ;
                    if (viewStub != null && (inflate = viewStub.inflate()) != null) {
                        w1w = (W1W) inflate.findViewById(R.id.k7w);
                    }
                    this.LLIIIZ = w1w;
                    if (w1w != null) {
                        for (float f : this.LLIIIL) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(f);
                            LIZ.append('x');
                            String content = X1D.LIZIZ(LIZ);
                            o.LJIIIZ(content, "content");
                            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(w1w.getContext()), R.layout.c_u, w1w.LJLJLLL, false);
                            o.LJII(LLLLIILL2, "null cannot be cast to non-null type android.widget.TextView");
                            TextView textView = (TextView) LLLLIILL2;
                            textView.setText(content);
                            textView.setTextSize(0, w1w.LJLJJI);
                            textView.setTextColor(w1w.LJLJJL);
                            textView.setBackgroundResource(R.drawable.v_);
                            C16880lQ.LJIJI(textView, w1w.LJLLI);
                            w1w.LJLJLLL.addView(textView);
                        }
                    }
                    W1W w1w2 = this.LLIIIZ;
                    if (w1w2 != null) {
                        w1w2.setOnItemChangeListener(new WGI(this));
                    }
                    if (this.LLFFF) {
                        View view4 = this.LLII;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        }
                        this.LLFFF = false;
                    }
                    FrameLayout frameLayout = this.LJLILLLLZI;
                    if (frameLayout != null) {
                        C26338AVi.LJ(frameLayout, Integer.valueOf(C17N.LJIILL(15.0d)), 0, 0, 0, true);
                        if (theme == L7Q.WHITE) {
                            wgj = new WGJ(R.color.ar, R.color.ck, R.color.cs, R.color.cn, R.color.al, R.color.ck, R.attr.gp, R.attr.gp);
                        } else {
                            wgj = new WGJ(R.color.b7, R.color.bc, R.color.bc, R.color.be, R.color.b1, R.color.bc, R.attr.dj, R.attr.dn);
                        }
                        ActivityC45651qj activityC45651qj3 = this.LJLJJL;
                        if (activityC45651qj3 != null) {
                            int color = activityC45651qj3.getResources().getColor(wgj.LJLIL);
                            ActivityC45651qj activityC45651qj4 = this.LJLJJL;
                            if (activityC45651qj4 != null) {
                                int color2 = activityC45651qj4.getResources().getColor(wgj.LJLJJI);
                                ActivityC45651qj activityC45651qj5 = this.LJLJJL;
                                if (activityC45651qj5 != null) {
                                    activityC45651qj5.getResources().getColor(wgj.LJLJJL);
                                    ActivityC45651qj activityC45651qj6 = this.LJLJJL;
                                    if (activityC45651qj6 != null) {
                                        Integer LJI2 = C79045V0n.LJI(wgj.LJLJLLL, activityC45651qj6);
                                        if (LJI2 != null) {
                                            i2 = LJI2.intValue();
                                        } else {
                                            i2 = color;
                                        }
                                        ActivityC45651qj activityC45651qj7 = this.LJLJJL;
                                        if (activityC45651qj7 != null) {
                                            int color3 = activityC45651qj7.getResources().getColor(wgj.LJLILLLLZI);
                                            if (theme == L7Q.CONST) {
                                                ActivityC45651qj activityC45651qj8 = this.LJLJJL;
                                                if (activityC45651qj8 != null) {
                                                    Integer LJI3 = C79045V0n.LJI(R.attr.d_, activityC45651qj8);
                                                    if (LJI3 != null) {
                                                        color = LJI3.intValue();
                                                    }
                                                    ActivityC45651qj activityC45651qj9 = this.LJLJJL;
                                                    if (activityC45651qj9 != null) {
                                                        Integer LJI4 = C79045V0n.LJI(R.attr.dm, activityC45651qj9);
                                                        if (LJI4 != null) {
                                                            color2 = LJI4.intValue();
                                                        }
                                                        ActivityC45651qj activityC45651qj10 = this.LJLJJL;
                                                        if (activityC45651qj10 != null) {
                                                            Integer LJI5 = C79045V0n.LJI(R.attr.d2, activityC45651qj10);
                                                            if (LJI5 != null) {
                                                                LJI5.intValue();
                                                            }
                                                        } else {
                                                            o.LJIJI("mContext");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mContext");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mContext");
                                                    throw null;
                                                }
                                            }
                                            ActivityC45651qj activityC45651qj11 = this.LJLJJL;
                                            if (activityC45651qj11 != null) {
                                                Resources resources = activityC45651qj11.getResources();
                                                TuxTextView tuxTextView = this.LJLL;
                                                if (tuxTextView != null) {
                                                    tuxTextView.setTextColor(resources.getColor(wgj.LJLJI));
                                                }
                                                TuxTextView tuxTextView2 = this.LJLLI;
                                                if (tuxTextView2 != null) {
                                                    tuxTextView2.setTextColor(i2);
                                                }
                                                TuxTextView tuxTextView3 = this.LJLLL;
                                                if (tuxTextView3 != null) {
                                                    tuxTextView3.setTextColor(resources.getColor(wgj.LJLILLLLZI));
                                                }
                                                TuxTextView tuxTextView4 = this.LJLLLL;
                                                if (tuxTextView4 != null) {
                                                    tuxTextView4.setTextColor(resources.getColor(wgj.LJLILLLLZI));
                                                }
                                                TuxTextView tuxTextView5 = this.LJLLILLLL;
                                                if (tuxTextView5 != null) {
                                                    tuxTextView5.setTextColor(color3);
                                                }
                                                TuxTextView tuxTextView6 = this.LJLLJ;
                                                if (tuxTextView6 != null) {
                                                    tuxTextView6.setTextColor(color2);
                                                }
                                                TuxTextView tuxTextView7 = this.LLFII;
                                                if (tuxTextView7 != null) {
                                                    tuxTextView7.setTextColor(resources.getColor(wgj.LJLILLLLZI));
                                                }
                                                View view5 = this.LJZI;
                                                if (view5 != null) {
                                                    view5.setBackgroundColor(resources.getColor(wgj.LJLJJLL));
                                                }
                                                this.LLIIJLIL = resources.getColor(wgj.LJLJJL);
                                                View view6 = this.LJLJLLL;
                                                if (view6 != null) {
                                                    view6.setBackgroundColor(resources.getColor(wgj.LJLIL));
                                                    WG7 wg7 = this.LJLJLJ;
                                                    if (wg7 != null) {
                                                        ActivityC45651qj activityC45651qj12 = this.LJLJJL;
                                                        if (activityC45651qj12 != null) {
                                                            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(wgj.LJLJLJ, activityC45651qj12);
                                                            int color4 = resources.getColor(wgj.LJLJL);
                                                            WG9 wg9 = wg7.LLLF;
                                                            if (wg9 != null) {
                                                                wg9.LJLL = LJIIIIZZ;
                                                                wg9.LJLILLLLZI.LIZ(LJIIIIZZ);
                                                                wg9.LJLJLLL = color4;
                                                                wg9.LJLIL.setColor(color4);
                                                                wg9.invalidate();
                                                                TuxTextView tuxTextView8 = this.LJLLLLLL;
                                                                if (tuxTextView8 != null) {
                                                                    tuxTextView8.setTextColor(resources.getColor(wgj.LJLILLLLZI));
                                                                }
                                                                TuxTextView tuxTextView9 = this.LJLZ;
                                                                if (tuxTextView9 != null) {
                                                                    tuxTextView9.setTextColor(resources.getColor(wgj.LJLILLLLZI));
                                                                }
                                                                int[] iArr = {color, 0};
                                                                View view7 = this.LL;
                                                                if (view7 != null) {
                                                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                                                    gradientDrawable.setColors(iArr);
                                                                    gradientDrawable.setGradientType(0);
                                                                    ActivityC45651qj activityC45651qj13 = this.LJLJJL;
                                                                    if (activityC45651qj13 != null) {
                                                                        if (C90193gN.LIZIZ(activityC45651qj13)) {
                                                                            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                                                                        } else {
                                                                            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                                                                        }
                                                                        gradientDrawable.setOrientation(orientation);
                                                                        view7.setBackground(gradientDrawable);
                                                                    } else {
                                                                        o.LJIJI("mContext");
                                                                        throw null;
                                                                    }
                                                                }
                                                                View view8 = this.LLD;
                                                                if (view8 != null) {
                                                                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                                                                    gradientDrawable2.setColors(iArr);
                                                                    gradientDrawable2.setColors(new int[]{0, color});
                                                                    gradientDrawable2.setGradientType(0);
                                                                    ActivityC45651qj activityC45651qj14 = this.LJLJJL;
                                                                    if (activityC45651qj14 != null) {
                                                                        if (C90193gN.LIZIZ(activityC45651qj14)) {
                                                                            orientation2 = GradientDrawable.Orientation.RIGHT_LEFT;
                                                                        } else {
                                                                            orientation2 = GradientDrawable.Orientation.LEFT_RIGHT;
                                                                        }
                                                                        gradientDrawable2.setOrientation(orientation2);
                                                                        view8.setBackground(gradientDrawable2);
                                                                    } else {
                                                                        o.LJIJI("mContext");
                                                                        throw null;
                                                                    }
                                                                }
                                                                View view9 = this.LJLJLLL;
                                                                if (view9 != null) {
                                                                    view9.getBackground().setAlpha(30);
                                                                    View view10 = this.LJLJLLL;
                                                                    if (view10 != null) {
                                                                        view10.invalidate();
                                                                        ASL asl3 = this.LJLJL;
                                                                        if (asl3 != null) {
                                                                            asl3.LIZ.LJLIL = new IDCListenerS288S0100000_14(this, 0);
                                                                            TuxTextView tuxTextView10 = this.LJLLLL;
                                                                            if (tuxTextView10 != null) {
                                                                                C16880lQ.LJJJJI(tuxTextView10, new ACListenerS34S0100000_14(this, 80));
                                                                            }
                                                                            TuxTextView tuxTextView11 = this.LJLLL;
                                                                            if (tuxTextView11 != null) {
                                                                                C16880lQ.LJJJJI(tuxTextView11, new ACListenerS34S0100000_14(this, 81));
                                                                            }
                                                                            View view11 = this.LLF;
                                                                            if (view11 != null) {
                                                                                C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 82), view11);
                                                                            }
                                                                            View view12 = this.LLI;
                                                                            if (view12 != null) {
                                                                                C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 83), view12);
                                                                            }
                                                                            WG7 wg72 = this.LJLJLJ;
                                                                            if (wg72 != null) {
                                                                                wg72.setOnScrollingListener(new WGK(this));
                                                                                return;
                                                                            } else {
                                                                                o.LJIJI("cutMusicScrollView");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        o.LJIJI("mSheetBuilder");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("cutMusicPanelView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("cutMusicPanelView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("cutMusicView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mContext");
                                                        throw null;
                                                    }
                                                    o.LJIJI("cutMusicScrollView");
                                                    throw null;
                                                }
                                                o.LJIJI("cutMusicPanelView");
                                                throw null;
                                            }
                                            o.LJIJI("mContext");
                                            throw null;
                                        }
                                        o.LJIJI("mContext");
                                        throw null;
                                    }
                                    o.LJIJI("mContext");
                                    throw null;
                                }
                                o.LJIJI("mContext");
                                throw null;
                            }
                            o.LJIJI("mContext");
                            throw null;
                        }
                        o.LJIJI("mContext");
                        throw null;
                    }
                    o.LJIJI("soundFilterFramelayout");
                    throw null;
                }
                o.LJIJI("cutMusicPanelView");
                throw null;
            }
            o.LJIJI("mContext");
            throw null;
        }
        o.LJIJI("cutMusicPanelView");
        throw null;
    }

    @Override // X.InterfaceC82187WNj
    public final boolean Q1(MusicWaveBean musicWaveBean, int i, int i2, int i3, boolean z) {
        StringBuilder LIZJ = C06460Ne.LIZJ("updateAudioWaveViewData: musiclength ", i, ", videolength ", i3, ", wave:");
        LIZJ.append(musicWaveBean);
        H7B.LIZ(X1D.LIZIZ(LIZJ));
        if (i == 0 || i3 == 0 || musicWaveBean == null) {
            return false;
        }
        Gl(0);
        WG7 wg7 = this.LJLJLJ;
        if (wg7 != null) {
            wg7.LJLI(0);
            wg7.LLLFFI = 0.0f;
            WG9 wg9 = wg7.LLLF;
            if (wg9 != null) {
                wg9.LJLJJI = 0;
                WGA wga = wg9.LJLILLLLZI;
                int i4 = wg9.LJLJLJ;
                wga.LJI = 0;
                wga.LJII = i4;
                wg9.invalidate();
                ActivityC45651qj activityC45651qj = this.LJLJJL;
                if (activityC45651qj != null) {
                    String string = activityC45651qj.getResources().getString(R.string.rgb, Integer.valueOf(i3 / 1000));
                    o.LJIIIIZZ(string, "mContext.resources.getSt…elected, selected / 1000)");
                    TuxTextView tuxTextView = this.LJLLILLLL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(string);
                    }
                    TuxTextView tuxTextView2 = this.LJLLJ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(string);
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" / ");
                    LIZ.append(C78929UyL.LJIIIZ(i));
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    TuxTextView tuxTextView3 = this.LJLLI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(LIZIZ);
                    }
                    Gl(i2);
                    int W1 = (W1() * i) / i3;
                    if (W1 != musicWaveBean.getMusicWavePointArray().length) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        C0EH.LIZLLL(LIZ2, this.LLILZLL, "error wave size: aimcnt:", W1, " , arr: ");
                        LIZ2.append(musicWaveBean.getMusicWavePointArray().length);
                        H7B.LIZ(X1D.LIZIZ(LIZ2));
                    }
                    float[] musicWavePointArray = musicWaveBean.getMusicWavePointArray();
                    if (musicWavePointArray == null || musicWavePointArray.length == 0) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(this.LLILZLL);
                        LIZ3.append("use default view");
                        H7B.LIZ(X1D.LIZIZ(LIZ3));
                        MusicWaveBean LIZJ2 = WGE.LIZJ(W1);
                        WG7 wg72 = this.LJLJLJ;
                        if (wg72 != null) {
                            wg72.LJLJJL(LIZJ2);
                        } else {
                            o.LJIJI("cutMusicScrollView");
                            throw null;
                        }
                    } else {
                        WG7 wg73 = this.LJLJLJ;
                        if (wg73 != null) {
                            wg73.LJLJJL(musicWaveBean);
                        } else {
                            o.LJIJI("cutMusicScrollView");
                            throw null;
                        }
                    }
                    Wh((i2 * 1.0f) / i, i2, z);
                    return true;
                }
                o.LJIJI("mContext");
                throw null;
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
        o.LJIJI("cutMusicScrollView");
        throw null;
    }
}
