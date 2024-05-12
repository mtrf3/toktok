package X;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171236nn {
    public final /* synthetic */ FilterEffectTabFragment LIZ;

    public C171236nn(FilterEffectTabFragment filterEffectTabFragment) {
        this.LIZ = filterEffectTabFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZ(int i, int i2, EffectModel effectModel) {
        InterfaceC84498XEg LIZ;
        InterfaceC84498XEg LIZ2;
        if (effectModel.isGoToCapCutEffect) {
            EditEffectVideoModel editEffectVideoModel = this.LIZ.LJLLLL;
            if (editEffectVideoModel != null) {
                g0.LJJIL(editEffectVideoModel.gv0(), effectModel);
                return false;
            }
            o.LJIJI("mViewModel");
            throw null;
        }
        FilterEffectTabFragment filterEffectTabFragment = this.LIZ;
        EditEffectVideoModel editEffectVideoModel2 = filterEffectTabFragment.LJLLLL;
        if (editEffectVideoModel2 != null) {
            if (editEffectVideoModel2.LJZL && !filterEffectTabFragment.LLD) {
                return false;
            }
            if (o.LJ(((LiveData) editEffectVideoModel2.LJZ.getValue()).getValue(), Boolean.TRUE) && (5 == i || i == 0)) {
                return false;
            }
            FilterEffectTabFragment filterEffectTabFragment2 = this.LIZ;
            EditEffectVideoModel editEffectVideoModel3 = filterEffectTabFragment2.LJLLLL;
            if (editEffectVideoModel3 != null) {
                ArrayList<EffectPointModel> J7 = editEffectVideoModel3.hv0().J7();
                Effect effect = (Effect) ListProtector.get(filterEffectTabFragment2.wl(), i2);
                if (5 == i) {
                    filterEffectTabFragment2.LLD = true;
                    filterEffectTabFragment2.Dl(i2);
                    if (filterEffectTabFragment2.LJLJLJ != null && C84507XEp.LJ(effect)) {
                        editEffectVideoModel3.jv0().setValue(VEEffectSelectOp.selectTrans(effectModel));
                        if (filterEffectTabFragment2.LJLJLJ != null && (LIZ2 = C170256mD.LIZ()) != null) {
                            LIZ2.LJJJI(effect);
                        }
                        if (!J7.isEmpty()) {
                            filterEffectTabFragment2.LJLLILLLL.add(ListProtector.get(J7, J7.size() - 1));
                            ArrayList<EffectPointModel> arrayList = filterEffectTabFragment2.LJLLILLLL;
                            if (((EffectPointModel) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).getDuration() < 100) {
                                filterEffectTabFragment2._$_findCachedViewById(R.id.lw5).performClick();
                            } else {
                                filterEffectTabFragment2._$_findCachedViewById(R.id.lw5).setVisibility(0);
                                if (filterEffectTabFragment2.Il()) {
                                    ((LiveData) filterEffectTabFragment2.LL.getValue()).setValue(Boolean.FALSE);
                                }
                            }
                        } else {
                            C0JU.LIZLLL("add effect fail");
                        }
                        C171246no c171246no = filterEffectTabFragment2.LJLLL;
                        if (c171246no != null) {
                            c171246no.LJLLLLLL(i2, 16);
                        } else {
                            o.LJIJI("mEffectAdapter");
                            throw null;
                        }
                    } else {
                        filterEffectTabFragment2.Al(new AqS149S0200000_2(filterEffectTabFragment2, effect, 8));
                    }
                } else if (i == 0) {
                    filterEffectTabFragment2.LLD = true;
                    if (filterEffectTabFragment2.LJLJJLL) {
                        C171296nt c171296nt = filterEffectTabFragment2.LJLLLLLL;
                        if (c171296nt != null) {
                            c171296nt.LIZ(i2);
                        } else {
                            o.LJIJI("motionEffectControll");
                            throw null;
                        }
                    }
                    filterEffectTabFragment2.Dl(i2);
                    if (filterEffectTabFragment2.LJLJLJ != null && C84507XEp.LJ(effect)) {
                        if (TextUtils.isEmpty(effectModel.resDir)) {
                            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("applyFilter_resdir_null:");
                            String str = effectModel.key;
                            if (str == null) {
                                str = "";
                            }
                            LIZ3.append(str);
                            LJJIIZI.LJIIZILJ(X1D.LIZIZ(LIZ3));
                        }
                        filterEffectTabFragment2.Gl(Integer.valueOf(i), effectModel);
                        if (filterEffectTabFragment2.LJLJLJ != null && (LIZ = C170256mD.LIZ()) != null) {
                            LIZ.LJJJI(effect);
                        }
                        C171246no c171246no2 = filterEffectTabFragment2.LJLLL;
                        if (c171246no2 != null) {
                            c171246no2.LJLLLLLL(i2, 16);
                        } else {
                            o.LJIJI("mEffectAdapter");
                            throw null;
                        }
                    } else {
                        filterEffectTabFragment2.Al(new AqS149S0200000_2(filterEffectTabFragment2, effect, 9));
                    }
                } else if (1 == i && filterEffectTabFragment2.LLD) {
                    filterEffectTabFragment2.LLD = false;
                    if (filterEffectTabFragment2.LJLJJLL) {
                        C171296nt c171296nt2 = filterEffectTabFragment2.LJLLLLLL;
                        if (c171296nt2 != null) {
                            c171296nt2.LIZIZ(i2);
                        } else {
                            o.LJIJI("motionEffectControll");
                            throw null;
                        }
                    }
                    if (filterEffectTabFragment2.LJLJLJ != null && C84507XEp.LJ(effect)) {
                        filterEffectTabFragment2._$_findCachedViewById(R.id.lw5).setVisibility(0);
                        editEffectVideoModel3.jv0().setValue(VEEffectSelectOp.selectFilter(i, effectModel));
                        if (filterEffectTabFragment2.Il()) {
                            ((LiveData) filterEffectTabFragment2.LL.getValue()).setValue(Boolean.FALSE);
                        }
                    }
                }
                C170516md c170516md = filterEffectTabFragment2.LJZI;
                if (c170516md != null) {
                    c170516md.LIZ = i;
                    c170516md.LIZIZ = i2;
                    c170516md.LIZJ = effectModel;
                    return true;
                }
                o.LJIJI("mTouchStateHolder");
                throw null;
            }
            o.LJIJI("mViewModel");
            throw null;
        }
        o.LJIJI("mViewModel");
        throw null;
    }
}
