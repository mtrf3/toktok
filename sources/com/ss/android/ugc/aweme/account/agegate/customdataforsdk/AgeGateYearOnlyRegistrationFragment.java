package com.ss.android.ugc.aweme.account.agegate.customdataforsdk;

import X.C16880lQ;
import X.C1E4;
import X.C62960OnM;
import X.C74090T5y;
import X.C76800UCe;
import X.C80607VkJ;
import X.C81108VsO;
import X.C86057Xq1;
import X.C86058Xq2;
import X.FMX;
import X.SY4;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AgeGateYearOnlyRegistrationFragment extends TTKAgeGateRegistrationFragment {
    public boolean LJLLI;
    public Date LJLLILLLL;
    public String LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment, com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final MutableLiveData<C76800UCe> wl() {
        if (this.LJLLI) {
            this.LJLLI = false;
            Vl();
            Tl(null);
            Pl().LJLIL.observe(this, new AObserverS83S0100000_15(this, 10));
            Date date = this.LJLLILLLL;
            if (date != null) {
                long time = date.getTime();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(time);
                Yl(calendar.get(1));
                C81108VsO c81108VsO = (C81108VsO) _$_findCachedViewById(R.id.yv);
                if (c81108VsO != null) {
                    int i = calendar.get(1);
                    C80607VkJ yearPicker = c81108VsO.getYearPicker();
                    if (yearPicker != null) {
                        yearPicker.LIZLLL(i);
                    }
                }
            }
            FMX.LJIIL("back_to_year_only_age_gate", null);
            return new MutableLiveData<>();
        }
        return super.wl();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment
    public final void Vl() {
        C74090T5y c74090T5y;
        int i;
        C80607VkJ yearPicker;
        int i2;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ym);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.yv);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(0);
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.yo);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (C62960OnM.LIZ() == 2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(C1E4.LJLILLLLZI);
            int i3 = calendar.get(1);
            C80607VkJ yearPicker2 = ((C81108VsO) _$_findCachedViewById(R.id.yv)).getYearPicker();
            if (yearPicker2 != null) {
                i = yearPicker2.getStartNumber();
            } else {
                i = 0;
            }
            int i4 = i3 - i;
            int i5 = i4 + 1;
            String[] strArr = new String[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                strArr[i6] = String.valueOf(i6);
            }
            if (i4 >= 0) {
                int i7 = 0;
                while (true) {
                    C80607VkJ yearPicker3 = ((C81108VsO) _$_findCachedViewById(R.id.yv)).getYearPicker();
                    if (yearPicker3 != null) {
                        i2 = yearPicker3.getStartNumber();
                    } else {
                        i2 = 0;
                    }
                    int i8 = (i3 - i2) - i7;
                    String quantityString = getResources().getQuantityString(R.plurals.b6, i8, Integer.valueOf(i8));
                    o.LJIIIIZZ(quantityString, "resources.getQuantityStr…r_ageSelection, age, age)");
                    strArr[i7] = quantityString;
                    if (i7 == i4) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            C81108VsO c81108VsO = (C81108VsO) _$_findCachedViewById(R.id.yv);
            if (c81108VsO != null && (yearPicker = c81108VsO.getYearPicker()) != null) {
                yearPicker.setNonRecurrent(true);
                yearPicker.LIZLLL(i3 - 1);
                yearPicker.LJ(i3);
                yearPicker.LLILIL = strArr;
                yearPicker.LJFF();
                yearPicker.invalidate();
            }
            C74090T5y c74090T5y2 = (C74090T5y) _$_findCachedViewById(R.id.yn);
            if (c74090T5y2 != null) {
                String string = getString(R.string.bif);
                o.LJIIIIZZ(string, "getString(R.string.ageGa…ge_formField_placeholder)");
                c74090T5y2.setText(string);
            }
        } else if (C62960OnM.LIZ() == 1 && (c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.yn)) != null) {
            String string2 = getString(R.string.biq);
            o.LJIIIIZZ(string2, "getString(R.string.ageGa…ar_formField_placeholder)");
            c74090T5y.setText(string2);
        }
        C81108VsO c81108VsO2 = (C81108VsO) _$_findCachedViewById(R.id.yv);
        if (c81108VsO2 != null) {
            c81108VsO2.LJLJL = new C86058Xq2(this);
        }
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.yr);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS35S0100000_15(this, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment, com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Dl(C86057Xq1 c86057Xq1) {
        if (this.LJLLI) {
            Tl(c86057Xq1);
        } else {
            super.Dl(c86057Xq1);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment, com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Il(String str) {
        C74090T5y c74090T5y;
        this.LJLLJ = str;
        if (this.LJLLI && (c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.yn)) != null) {
            c74090T5y.setText(String.valueOf(str));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment
    public final void Tl(C86057Xq1 c86057Xq1) {
        String str;
        String str2;
        List<PNSHyperlink> list = null;
        if (this.LJLLI) {
            if (c86057Xq1 != null) {
                str = c86057Xq1.getTitle();
            } else {
                str = null;
            }
            Sl(str);
            if (c86057Xq1 != null) {
                str2 = c86057Xq1.getContentDesc();
                list = c86057Xq1.getHyperLinks();
            } else {
                str2 = null;
            }
            Rl(str2, list);
        } else if (C62960OnM.LIZ() == 2) {
            Sl(getString(R.string.bid));
            Rl(getString(R.string.bic), null);
        } else if (C62960OnM.LIZ() == 1) {
            Sl(getString(R.string.bin));
            Rl(getString(R.string.bim), null);
        }
        String string = getString(R.string.ce7);
        TextView textView = (TextView) _$_findCachedViewById(R.id.yr);
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void Yl(int i) {
        C74090T5y c74090T5y;
        if (C62960OnM.LIZ() == 2) {
            C74090T5y c74090T5y2 = (C74090T5y) _$_findCachedViewById(R.id.yn);
            if (c74090T5y2 != null) {
                int i2 = Calendar.getInstance().get(1) - i;
                String quantityString = getResources().getQuantityString(R.plurals.b6, i2, Integer.valueOf(i2));
                o.LJIIIIZZ(quantityString, "resources.getQuantityStr…r_ageSelection, age, age)");
                c74090T5y2.setText(quantityString);
                return;
            }
            return;
        }
        if (C62960OnM.LIZ() != 1 || (c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.yn)) == null) {
            return;
        }
        c74090T5y.setText(String.valueOf(i));
    }
}
