package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12830et {
    public final Context LIZ;
    public final FragmentManager LIZIZ;
    public final FragmentManager LIZJ;
    public final LiveSheetHostFragment LIZLLL;
    public final List<InterfaceC32911Qx> LJ = new ArrayList();
    public final java.util.Map<String, InterfaceC32911Qx> LJFF = new HashMap();
    public final int LJI = R.id.fv_;
    public final ViewGroup LJII;
    public final long LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public boolean LJIIJJI;

    public final void LIZ() {
        this.LJIIJJI = true;
        while (!((ArrayList) this.LJ).isEmpty()) {
            List<InterfaceC32911Qx> list = this.LJ;
            LIZIZ((InterfaceC32911Qx) U26.LIZIZ((ArrayList) list, 1, list));
        }
    }

    public final InterfaceC32911Qx LIZLLL() {
        if (((ArrayList) this.LJ).isEmpty()) {
            return null;
        }
        return (InterfaceC32911Qx) ListProtector.get(this.LJ, ((ArrayList) r1).size() - 1);
    }

    public final boolean LJI() {
        if (this.LJIIIZ == 1) {
            return true;
        }
        return false;
    }

    public final void LJIIJ() {
        if (!((ArrayList) this.LJ).isEmpty()) {
            LIZIZ((InterfaceC32911Qx) ListProtector.get(this.LJ, ((ArrayList) r1).size() - 1));
        }
    }

    public final int LIZJ() {
        if (LJI()) {
            return R.anim.dy;
        }
        return R.anim.dq;
    }

    public final void LJFF() {
        InterfaceC32911Qx LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            if (!LIZLLL.ah() && LIZLLL.getFragment() != null) {
                V16.LJJIIJZLJL(LIZLLL.getFragment().getView());
            }
            LIZLLL.hide();
        }
    }

    public final void LIZIZ(InterfaceC32911Qx interfaceC32911Qx) {
        int i;
        if (interfaceC32911Qx == null || ((ArrayList) this.LJ).isEmpty() || !interfaceC32911Qx.isAdded()) {
            return;
        }
        ((ArrayList) this.LJ).remove(interfaceC32911Qx);
        ((HashMap) this.LJFF).remove(interfaceC32911Qx.nk());
        if (((ArrayList) this.LJ).isEmpty()) {
            this.LJIIJJI = true;
            LiveSheetHostFragment liveSheetHostFragment = this.LIZLLL;
            if (liveSheetHostFragment != null && liveSheetHostFragment.isAdded()) {
                FragmentManager fragmentManager = this.LIZJ;
                C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
                LIZ.LJJI(this.LIZLLL);
                LIZ.LJI();
            }
        } else {
            FragmentManager fragmentManager2 = this.LIZIZ;
            C1B3 LIZ2 = C1B6.LIZ(fragmentManager2, fragmentManager2);
            if (LJI()) {
                i = R.anim.dz;
            } else {
                i = R.anim.dr;
            }
            LIZ2.LJIIJJI(0, i, 0, 0);
            LIZ2.LJJI(interfaceC32911Qx.getFragment());
            LIZ2.LJI();
            C12850ev c12850ev = C12840eu.LIZ;
            c12850ev.LIZIZ();
            c12850ev.LIZJ();
            c12850ev.LIZLLL();
        }
        InterfaceC32911Qx LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        LIZLLL.show();
    }

    public final void LJ(InterfaceC32911Qx interfaceC32911Qx) {
        int i;
        if (interfaceC32911Qx == null || interfaceC32911Qx.getFragment() == null || !interfaceC32911Qx.isAdded() || interfaceC32911Qx.isHidden()) {
            return;
        }
        FragmentManager fragmentManager = this.LIZIZ;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        if (LJI()) {
            i = R.anim.dz;
        } else {
            i = R.anim.dr;
        }
        LIZ.LJIIJJI(0, i, 0, 0);
        LIZ.LJIIIZ(interfaceC32911Qx.getFragment());
        LIZ.LJI();
    }

    public final void LJIIJJI(InterfaceC32911Qx interfaceC32911Qx) {
        if (interfaceC32911Qx == null || !((ArrayList) this.LJ).contains(interfaceC32911Qx)) {
            return;
        }
        if (!interfaceC32911Qx.ah() && interfaceC32911Qx.getFragment() != null) {
            V16.LJJIIJZLJL(interfaceC32911Qx.getFragment().getView());
        }
        ((ArrayList) this.LJ).remove(interfaceC32911Qx);
        ((HashMap) this.LJFF).remove(interfaceC32911Qx.nk());
        if (interfaceC32911Qx instanceof AbstractC42651lt) {
            C16880lQ.LJLLL(((AbstractC42651lt) interfaceC32911Qx).LJLIL, this.LJII);
        }
        InterfaceC32911Qx LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.show();
        }
        if (((ArrayList) this.LJ).isEmpty()) {
            LiveSheetHostFragment liveSheetHostFragment = this.LIZLLL;
            if (liveSheetHostFragment == null || !liveSheetHostFragment.isAdded()) {
                return;
            }
            FragmentManager fragmentManager = this.LIZJ;
            C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
            LIZ.LJJI(this.LIZLLL);
            LIZ.LJI();
            return;
        }
        C12850ev c12850ev = C12840eu.LIZ;
        c12850ev.LIZIZ();
        c12850ev.LIZJ();
        c12850ev.LIZLLL();
    }

    public final void LJIILIIL(InterfaceC32911Qx interfaceC32911Qx) {
        if (interfaceC32911Qx == null || interfaceC32911Qx.getFragment() == null || !interfaceC32911Qx.isAdded() || !interfaceC32911Qx.isHidden()) {
            return;
        }
        FragmentManager fragmentManager = this.LIZIZ;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        LIZ.LJIIJJI(LIZJ(), 0, 0, 0);
        LIZ.LJIIL(interfaceC32911Qx.getFragment());
        LIZ.LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0es, android.view.View] */
    public final void LJIIIZ(InterfaceC32911Qx interfaceC32911Qx, String str) {
        if (interfaceC32911Qx == null || interfaceC32911Qx.getFragment() == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            LJFF();
            Fragment fragment = interfaceC32911Qx.getFragment();
            interfaceC32911Qx.jb(this);
            ((ArrayList) this.LJ).add(interfaceC32911Qx);
            ((HashMap) this.LJFF).put(interfaceC32911Qx.nk(), interfaceC32911Qx);
            int i = this.LJI;
            if (interfaceC32911Qx instanceof AbstractC42651lt) {
                final Context context = this.LIZ;
                ?? r2 = new FrameLayout(context) { // from class: X.0es
                    {
                        C0P1.LIZIZ(this, new C0PF() { // from class: X.1Qy
                            @Override // X.C0PF
                            public final C0PI LIZ(View view, C0PI c0pi) {
                                int i2;
                                C12820es c12820es = C12820es.this;
                                if (c12820es.hasWindowFocus()) {
                                    if (c12820es.getContext().getResources().getConfiguration().orientation == 2) {
                                        C12840eu.LIZ.getClass();
                                        i2 = c0pi.LIZ(8).LIZLLL;
                                    } else {
                                        i2 = Math.max(0, c0pi.LIZ(8).LIZLLL - c0pi.LIZ(2).LIZLLL);
                                    }
                                } else {
                                    i2 = 0;
                                }
                                c12820es.setPadding(0, 0, 0, i2);
                                return c0pi;
                            }
                        });
                    }

                    @Override // android.view.View
                    public final void onWindowFocusChanged(boolean z) {
                        InputMethodManager inputMethodManager;
                        super.onWindowFocusChanged(z);
                        if (!z && (inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method")) != null) {
                            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                        }
                    }
                };
                r2.setId(View.generateViewId());
                i = r2.getId();
                ((AbstractC42651lt) interfaceC32911Qx).LJLIL = r2;
                this.LJII.addView((View) r2, -1, -1);
            }
            FragmentManager fragmentManager = this.LIZIZ;
            C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
            LIZ.LJIIJJI(LIZJ(), 0, 0, 0);
            LIZ.LJIIIIZZ(i, 1, fragment, null);
            LIZ.LJII();
            return;
        }
        throw new IllegalArgumentException("Tag could not be empty.");
    }

    public final void LJII(Bundle bundle, SheetOptions sheetOptions, String str, String str2) {
        Fragment fragment;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                fragment = (Fragment) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                C16880lQ.LLLLIIL(e);
                fragment = null;
            } catch (IllegalAccessException e2) {
                throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (InstantiationException e3) {
                throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
            } catch (NoSuchMethodException e4) {
                throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
            } catch (InvocationTargetException e5) {
                throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
            }
            if (fragment instanceof LiveSheetFragment) {
                LJFF();
                LiveSheetFragment liveSheetFragment = (LiveSheetFragment) fragment;
                liveSheetFragment.LJLZ = this;
                ((ArrayList) this.LJ).add(liveSheetFragment);
                ((HashMap) this.LJFF).put(liveSheetFragment.LJLLLLLL, liveSheetFragment);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", true);
                bundle.putParcelable("com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS", sheetOptions);
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = this.LIZIZ;
                C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
                LIZ.LJIIJJI(LIZJ(), 0, 0, 0);
                LIZ.LJIIIIZZ(this.LJI, 1, fragment, null);
                LIZ.LJII();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tag could not be empty.");
    }

    public final void LJIIIIZZ(Class<? extends LiveSheetFragment> cls, String str, SheetOptions sheetOptions, Bundle bundle) {
        LJII(bundle, sheetOptions, C16880lQ.LJLLILLLL(cls), str);
    }

    public final void LJIIL(Class<? extends LiveSheetFragment> cls, String str, SheetOptions sheetOptions, Bundle bundle) {
        C32044Chs.LJIIIZ(this.LIZJ, cls, str, sheetOptions, bundle);
    }

    public C12830et(Context context, FragmentManager fragmentManager, FragmentManager fragmentManager2, C42661lu c42661lu, long j, LiveSheetHostFragment liveSheetHostFragment) {
        this.LIZ = context;
        this.LIZJ = fragmentManager;
        this.LIZIZ = fragmentManager2;
        this.LJII = c42661lu;
        this.LJIIIIZZ = j;
        this.LIZLLL = liveSheetHostFragment;
        this.LJIIIZ = context.getResources().getConfiguration().orientation;
        this.LJIIJ = C012403c.LIZ(context);
    }
}
