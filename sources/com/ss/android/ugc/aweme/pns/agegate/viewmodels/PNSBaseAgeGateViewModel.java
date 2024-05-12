package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.AbstractC40941G4z;
import X.C10K;
import X.C48360IyS;
import X.C62962OnO;
import X.C76800UCe;
import X.C86057Xq1;
import X.C86092Xqa;
import X.C86093Xqb;
import X.C86105Xqn;
import X.EnumC62974Ona;
import X.InterfaceC65784Pro;
import X.InterfaceC86091XqZ;
import Y.AgS22S0100100_15;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeGateServiceImpl;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.AgeGateResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.DoBResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.PNSAgeGateApi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class PNSBaseAgeGateViewModel extends ViewModel {
    public long LJLIL;
    public AbstractC40941G4z LJLILLLLZI;
    public InterfaceC86091XqZ LJLJI;
    public Map<String, String> LJLJJI = new LinkedHashMap();
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public Locale LJLJL;
    public final SimpleDateFormat LJLJLJ;
    public DateFormat LJLJLLL;
    public int LJLL;
    public final MutableLiveData<C86093Xqb> LJLLI;
    public final MutableLiveData<Boolean> LJLLILLLL;
    public final MutableLiveData<C86057Xq1> LJLLJ;
    public final MutableLiveData<Boolean> LJLLL;
    public final MutableLiveData<Boolean> LJLLLL;
    public final MutableLiveData<String> LJLLLLLL;
    public final MutableLiveData<Integer> LJLZ;
    public final MutableLiveData<Boolean> LJZ;
    public Date LJZI;
    public long LJZL;
    public long LL;
    public int LLD;
    public int LLF;
    public String LLFF;
    public boolean LLFFF;

    public void mv0() {
    }

    public final void gv0() {
        C10K<DoBResponse> calculateAge;
        this.LJLLLL.postValue(Boolean.TRUE);
        long currentTimeMillis = System.currentTimeMillis();
        PNSAgeGateApi pNSAgeGateApi = PNSAgeGateServiceImpl.LIZIZ;
        if (pNSAgeGateApi == null || (calculateAge = pNSAgeGateApi.calculateAge(hv0(), this.LLD, this.LLF)) == null) {
            return;
        }
        calculateAge.LJ(new AgS22S0100100_15(this, currentTimeMillis, 1), C10K.LJIIIIZZ, null);
    }

    public final String hv0() {
        String format;
        Date date = this.LJZI;
        if (date == null || (format = this.LJLJLJ.format(date)) == null) {
            return "";
        }
        return format;
    }

    public boolean onBackPressed() {
        C86057Xq1 LJ;
        InterfaceC86091XqZ interfaceC86091XqZ = this.LJLJI;
        if (interfaceC86091XqZ == null || (LJ = interfaceC86091XqZ.LJ()) == null || !o.LJ(LJ.getCanQuit(), Boolean.TRUE)) {
            return false;
        }
        lv0(null, 0, -3001);
        AbstractC40941G4z abstractC40941G4z = this.LJLILLLLZI;
        if (abstractC40941G4z != null) {
            abstractC40941G4z.onCancel();
        }
        return true;
    }

    public final void ov0() {
        C10K<AgeGateResponse> verifyAge;
        this.LJLLLL.postValue(Boolean.TRUE);
        long currentTimeMillis = System.currentTimeMillis();
        PNSAgeGateApi pNSAgeGateApi = PNSAgeGateServiceImpl.LIZIZ;
        if (pNSAgeGateApi == null || (verifyAge = pNSAgeGateApi.verifyAge(hv0(), this.LLD, this.LLF, this.LJLJJLL)) == null) {
            return;
        }
        verifyAge.LJ(new AgS22S0100100_15(this, currentTimeMillis, 2), C10K.LJIIIIZZ, null);
    }

    public PNSBaseAgeGateViewModel() {
        Locale locale = Locale.ROOT;
        this.LJLJL = locale;
        this.LJLJLJ = new SimpleDateFormat("yyyy-MM-dd", locale);
        this.LJLJLLL = DateFormat.getDateInstance(1, locale);
        this.LJLL = EnumC62974Ona.NONE.getValue();
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new MutableLiveData<>();
        this.LJLLJ = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(Boolean.FALSE);
        this.LJLLL = mutableLiveData;
        this.LJLLLL = new MutableLiveData<>();
        this.LJLLLLLL = new MutableLiveData<>();
        this.LJLZ = new MutableLiveData<>();
        this.LJZ = new MutableLiveData<>();
        this.LLD = -1;
        this.LLF = -1;
        this.LLFF = "";
    }

    public PNSFeedbackModel nv0(DoBResponse doBResponse) {
        PNSFeedbackModel ageGateFeedback = doBResponse.getAgeGateFeedback();
        if (ageGateFeedback == null) {
            InterfaceC86091XqZ interfaceC86091XqZ = this.LJLJI;
            if (interfaceC86091XqZ == null) {
                return null;
            }
            return interfaceC86091XqZ.LJI();
        }
        return ageGateFeedback;
    }

    public final void iv0(int i, String str) {
        MutableLiveData<Boolean> mutableLiveData = this.LJLLLL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        this.LJLLL.postValue(bool);
        PNSFeedbackModel pNSFeedbackModel = null;
        if (i == 56004) {
            InterfaceC86091XqZ interfaceC86091XqZ = this.LJLJI;
            if (interfaceC86091XqZ != null) {
                pNSFeedbackModel = interfaceC86091XqZ.LJII(str);
            }
            jv0(pNSFeedbackModel, new AqS165S0100000_15(this, 905));
            return;
        }
        InterfaceC86091XqZ interfaceC86091XqZ2 = this.LJLJI;
        if (interfaceC86091XqZ2 != null) {
            pNSFeedbackModel = interfaceC86091XqZ2.LIZJ(Integer.valueOf(i), str);
        }
        jv0(pNSFeedbackModel, C86105Xqn.LJLIL);
    }

    public final void jv0(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        if (pNSFeedbackModel == null || (pNSFeedbackModel.getDialogModel() == null && (pNSFeedbackModel == null || pNSFeedbackModel.getErrorModel() == null))) {
            action.invoke();
        } else {
            this.LJLLI.postValue(new C86093Xqb(pNSFeedbackModel, action));
        }
    }

    public final void lv0(C62962OnO c62962OnO, int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_code", String.valueOf(i2));
        linkedHashMap.put("page_stay_time", String.valueOf(SystemClock.elapsedRealtime() - this.LJLIL));
        linkedHashMap.put("is_success", String.valueOf(i));
        if (c62962OnO != null && c62962OnO.LIZJ) {
            linkedHashMap.put("has_delete_content", String.valueOf(i));
        }
        C48360IyS.LIZ(this.LLFF, linkedHashMap, this.LJLJJI);
    }

    public void kv0(AbstractC40941G4z abstractC40941G4z, InterfaceC86091XqZ interfaceC86091XqZ, long j, C86092Xqa params) {
        C86057Xq1 LJ;
        o.LJIIIZ(params, "params");
        this.LJLILLLLZI = abstractC40941G4z;
        this.LJLJI = interfaceC86091XqZ;
        MutableLiveData<C86057Xq1> mutableLiveData = this.LJLLJ;
        if (interfaceC86091XqZ == null) {
            LJ = null;
        } else {
            LJ = interfaceC86091XqZ.LJ();
        }
        mutableLiveData.postValue(LJ);
        this.LJLJJI = params.getLogParams();
        this.LJLJJL = params.isFtc();
        this.LJLJJLL = params.isGuestMode();
        this.LJLJL = params.getLocale();
        this.LJLL = params.getConfirmationType();
        this.LJLIL = j;
        this.LL = SystemClock.elapsedRealtime() - this.LJLIL;
        this.LJLJLLL = DateFormat.getDateInstance(1, this.LJLJL);
    }
}
