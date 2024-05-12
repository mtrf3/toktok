package Y;

import X.C188727au;
import X.C1XY;
import X.C2A7;
import X.C47121t6;
import X.C61878OQg;
import X.C71096RvI;
import X.C72458ScA;
import X.C72972SkS;
import X.C73305Spp;
import X.C73381Sr3;
import X.C74090T5y;
import X.C79045V0n;
import X.C85193Vz;
import X.DialogC73377Sqz;
import X.DialogC73383Sr5;
import X.FMX;
import X.GAR;
import X.InterfaceC88472Yns;
import X.TEN;
import X.TEW;
import X.TM8;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.following.ui.assem.RelationSearchAssem;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public class IDObjectS183S0100000_12 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$7(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable editable) {
    }

    public static final void beforeTextChanged$0(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$8(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                return;
            case 1:
                afterTextChanged$1(this, editable);
                return;
            case 2:
                o.LJIIIZ(editable, "s");
                return;
            case 3:
                o.LJIIIZ(editable, "s");
                return;
            case 4:
                afterTextChanged$4(this, editable);
                return;
            case 5:
                afterTextChanged$5(this, editable);
                return;
            case 6:
                afterTextChanged$6(this, editable);
                return;
            case 7:
                afterTextChanged$7(this, editable);
                return;
            case 8:
                afterTextChanged$8(this, editable);
                return;
            case 9:
                afterTextChanged$9(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            case 3:
                o.LJIIIZ(charSequence, "s");
                return;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                return;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                return;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                return;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                return;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                return;
            case 9:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                return;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                return;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                return;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                return;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                return;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                return;
            case 9:
                onTextChanged$9(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public IDObjectS183S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    public static final void afterTextChanged$0(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable s) {
        int i;
        o.LJIIIZ(s, "s");
        if (s.length() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        if (((DialogC73377Sqz) iDObjectS183S0100000_12.l0).findViewById(R.id.be9).getVisibility() != i) {
            ((ImageView) ((DialogC73377Sqz) iDObjectS183S0100000_12.l0).findViewById(R.id.be9)).setVisibility(i);
        }
        String charSequence = s.LJZI(s.toString()).toString();
        if (charSequence.length() == 0) {
            C85193Vz LJJI = ((DialogC73377Sqz) iDObjectS183S0100000_12.l0).LJJI();
            LJJI.getClass();
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            LJJI.LIZIZ.setValue(c61878OQg);
            C73381Sr3 LJJ = ((DialogC73377Sqz) iDObjectS183S0100000_12.l0).LJJ();
            ?? r0 = (List) ((DialogC73377Sqz) iDObjectS183S0100000_12.l0).LJJI().LIZ.getValue();
            if (r0 != 0) {
                c61878OQg = r0;
            }
            LJJ.setData(c61878OQg);
            return;
        }
        if (((DialogC73377Sqz) iDObjectS183S0100000_12.l0).LJJ().getItemCount() == 0) {
            ((C73305Spp) ((DialogC73377Sqz) iDObjectS183S0100000_12.l0).findViewById(R.id.kf_)).LJFF();
            ((C73305Spp) ((DialogC73377Sqz) iDObjectS183S0100000_12.l0).findViewById(R.id.kf_)).setVisibility(0);
        }
        ((DialogC73377Sqz) iDObjectS183S0100000_12.l0).LJJI().LIZJ(charSequence, false);
    }

    public static final void afterTextChanged$1(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable editable) {
        EffectEditVM Q3 = ((EffectEditAssem) iDObjectS183S0100000_12.l0).Q3();
        String valueOf = String.valueOf(editable);
        Q3.getClass();
        Q3.setState(new AqS35S1000000_12(valueOf, 2));
    }

    public static final void afterTextChanged$4(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable editable) {
        String str;
        TM8 tm8 = (TM8) iDObjectS183S0100000_12.l0;
        if (editable != null) {
            str = editable.toString();
        } else {
            str = null;
        }
        View view = tm8.LIZJ;
        if (view != null) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            view.setVisibility(i);
            tm8.LJFF.onNext(C1XY.LJJIIJ(str));
            return;
        }
        o.LJIJI("clearQueryButton");
        throw null;
    }

    public static final void afterTextChanged$5(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable editable) {
        if (editable != null && editable.length() == 0) {
            ((RelationSearchAssem) iDObjectS183S0100000_12.l0).A3(Boolean.FALSE);
        }
    }

    public static final void afterTextChanged$6(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable editable) {
        C74090T5y c74090T5y = (C74090T5y) iDObjectS183S0100000_12.l0;
        c74090T5y.setIndicatorVisible(c74090T5y.LJLIL.invoke().booleanValue());
    }

    public static final void afterTextChanged$8(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable s) {
        o.LJIIIZ(s, "s");
        String obj = s.toString();
        C71096RvI c71096RvI = (C71096RvI) iDObjectS183S0100000_12.l0;
        c71096RvI.LJLJLJ++;
        int i = 0;
        if (obj.length() != 0) {
            i = CastIntegerProtector.parseInt(obj);
        }
        c71096RvI.LJLIL = i;
    }

    public static final void afterTextChanged$9(IDObjectS183S0100000_12 iDObjectS183S0100000_12, Editable editable) {
        int i;
        String str;
        SearchStickerViewContainer searchStickerViewContainer = (SearchStickerViewContainer) iDObjectS183S0100000_12.l0;
        View view = searchStickerViewContainer.LJLJI;
        if (view != null) {
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            searchStickerViewContainer.LLFII = str;
            if (str.length() == 0) {
                TEW tew = searchStickerViewContainer.LJLLI;
                if (tew != null) {
                    Enum state = tew.getState();
                    TEN ten = TEN.NONE;
                    if (state != ten) {
                        TEW tew2 = searchStickerViewContainer.LJLLI;
                        if (tew2 != null) {
                            tew2.setState(ten);
                            LinearLayout linearLayout = searchStickerViewContainer.LJLJLLL;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            } else {
                                o.LJIJI("llStickerContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("statusView");
                            throw null;
                        }
                    }
                    searchStickerViewContainer.LJIIJ(true, false);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            }
            if (!(!o.LJ(str, searchStickerViewContainer.LLIIIJ.getKeyword().getValue()))) {
                return;
            }
            searchStickerViewContainer.LJIIIZ(false);
            return;
        }
        o.LJIJI("btnClearSearchText");
        throw null;
    }

    public static final void onTextChanged$2(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        String keyWord = s.toString();
        MufListPageViewModel Hl = ((MufListPageFragment) iDObjectS183S0100000_12.l0).Hl();
        Hl.getClass();
        o.LJIIIZ(keyWord, "keyWord");
        if (keyWord.length() == 0) {
            Hl.setState(C72458ScA.LJLIL);
        } else {
            ((ExecutorService) GAR.LIZ.getValue()).execute(new ARunnableS7S1100000_6(Hl, keyWord, 21));
        }
    }

    public static final void onTextChanged$3(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        String charSequence = s.toString();
        FollowingRelationViewModel Ol = ((FollowingRelationFragment) iDObjectS183S0100000_12.l0).Ol();
        AqS65S1100000_12 aqS65S1100000_12 = new AqS65S1100000_12((FollowingRelationFragment) iDObjectS183S0100000_12.l0, charSequence, 5);
        Ol.getClass();
        Ol.setStateImmediate(new AqS178S0100000_12((InterfaceC88472Yns) aqS65S1100000_12, 450));
        if (!TextUtils.isEmpty(charSequence)) {
            ((ImageView) ((FollowingRelationFragment) iDObjectS183S0100000_12.l0)._$_findCachedViewById(R.id.avg)).setVisibility(0);
            FollowingRelationFragment followingRelationFragment = (FollowingRelationFragment) iDObjectS183S0100000_12.l0;
            followingRelationFragment.LLFII = charSequence;
            if (followingRelationFragment.LLFZ) {
                FMX.LJIIL("search_friends", new C188727au().LIZ);
                ((FollowingRelationFragment) iDObjectS183S0100000_12.l0).LLFZ = false;
            }
            ((FollowingRelationFragment) iDObjectS183S0100000_12.l0).Vl();
            return;
        }
        ((FollowingRelationFragment) iDObjectS183S0100000_12.l0).Tl();
    }

    public static final void onTextChanged$7(IDObjectS183S0100000_12 iDObjectS183S0100000_12, CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        ForegroundColorSpan foregroundColorSpan;
        int length = String.valueOf(charSequence).length();
        String LIZLLL = C72972SkS.LIZLLL(length, "/200");
        boolean z2 = false;
        if (length > 200) {
            int length2 = String.valueOf(length).length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZLLL);
            Integer LJI = C79045V0n.LJI(R.attr.e7, ((DialogC73383Sr5) iDObjectS183S0100000_12.l0).LJLJLLL);
            if (LJI != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
            } else {
                foregroundColorSpan = null;
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, length2, 33);
            C47121t6 c47121t6 = ((DialogC73383Sr5) iDObjectS183S0100000_12.l0).LJLLL;
            if (c47121t6 != null) {
                c47121t6.setText(spannableStringBuilder);
            }
            C2A7 c2a7 = ((DialogC73383Sr5) iDObjectS183S0100000_12.l0).LJLLLL;
            if (c2a7 != null) {
                c2a7.setEnabled(false);
                c2a7.setClickable(false);
                return;
            }
            return;
        }
        C47121t6 c47121t62 = ((DialogC73383Sr5) iDObjectS183S0100000_12.l0).LJLLL;
        if (c47121t62 != null) {
            c47121t62.setText(LIZLLL);
        }
        C2A7 c2a72 = ((DialogC73383Sr5) iDObjectS183S0100000_12.l0).LJLLLL;
        if (c2a72 == null) {
            return;
        }
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        c2a72.setEnabled(z);
        if (length > 0) {
            z2 = true;
        }
        c2a72.setClickable(z2);
    }
}
