package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C44946HkU;
import X.C76800UCe;
import X.C82890Wg2;
import X.C83483Wpb;
import X.C83489Wph;
import X.C83492Wpk;
import X.C83860Wvg;
import X.C83861Wvh;
import X.C83902WwM;
import X.IB3;
import X.InterfaceC83481WpZ;
import X.InterfaceC83485Wpd;
import X.InterfaceC88474Ynu;
import X.TMB;
import Y.IDHandlerS24S0100000_14;
import android.app.Activity;
import android.os.Message;
import android.view.View;
import com.ss.android.vesdk.VERecorder;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class IDqS456S0100000_14 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS456S0100000_14(C83483Wpb c83483Wpb, int i) {
        super(4);
        this.$t = i;
        this.l0 = c83483Wpb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS456S0100000_14(C83492Wpk c83492Wpk, int i) {
        super(4);
        this.$t = i;
        this.l0 = c83492Wpk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS456S0100000_14(C83860Wvg c83860Wvg, int i) {
        super(4);
        this.$t = i;
        this.l0 = c83860Wvg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS456S0100000_14(C83861Wvh c83861Wvh, int i) {
        super(4);
        this.$t = i;
        this.l0 = c83861Wvh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS456S0100000_14(C83902WwM c83902WwM, int i) {
        super(4);
        this.$t = i;
        this.l0 = c83902WwM;
    }

    public final void invoke$0(boolean z, C83489Wph selectedData, List<IB3> mediaList, Map<C83489Wph, Integer> uploadPicDataList) {
        int i;
        o.LJIIIZ(selectedData, "selectedData");
        o.LJIIIZ(mediaList, "mediaList");
        o.LJIIIZ(uploadPicDataList, "uploadPicDataList");
        View LIZJ = ((C83483Wpb) this.l0).LIZJ();
        if (LIZJ != null) {
            int size = uploadPicDataList.size();
            C44946HkU c44946HkU = ((C83483Wpb) this.l0).LIZ;
            if (c44946HkU != null) {
                i = c44946HkU.LJLJJI;
            } else {
                i = 0;
            }
            if (size >= i) {
                LIZJ.setAlpha(1.0f);
            } else {
                LIZJ.setAlpha(0.4f);
            }
            InterfaceC83485Wpd interfaceC83485Wpd = ((C83483Wpb) this.l0).LJJIFFI;
            if (interfaceC83485Wpd != null) {
                interfaceC83485Wpd.LJJIFFI(selectedData.LIZ, selectedData.LIZLLL, "media_tray");
            }
            InterfaceC83481WpZ interfaceC83481WpZ = ((C83483Wpb) this.l0).LJJII;
            if (interfaceC83481WpZ != null) {
                interfaceC83481WpZ.LJ(mediaList, uploadPicDataList);
            }
        }
        if (z) {
            TMB tmb = C82890Wg2.LJFF;
            Activity activity = ((C83483Wpb) this.l0).LJJI;
            String string = activity.getString(R.string.e8n);
            o.LJIIIIZZ(string, "activity.getString(R.string.creation_upload_limit)");
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{Integer.valueOf(uploadPicDataList.size())}, 1));
            o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
            TMB.LIZLLL(tmb, activity, LLLZ).LIZ();
        }
    }

    public static final Object invoke$0(IDqS456S0100000_14 iDqS456S0100000_14, Object obj, Object obj2, Object obj3, Object recorder) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        o.LJIIIZ(recorder, "recorder");
        if (!((Boolean) ((C83861Wvh) iDqS456S0100000_14.l0).LJLJJL.invoke()).booleanValue()) {
            Iterator<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> it = ((C83861Wvh) iDqS456S0100000_14.l0).LJZI.iterator();
            while (it.hasNext()) {
                it.next().invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), obj3, recorder);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS456S0100000_14 iDqS456S0100000_14, Object obj, Object obj2, Object obj3, Object obj4) {
        String stickerId = (String) obj;
        String imagePath = (String) obj2;
        String scanAlgorithm = (String) obj3;
        ((Boolean) obj4).booleanValue();
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(scanAlgorithm, "scanAlgorithm");
        Message obtain = Message.obtain();
        C83489Wph c83489Wph = new C83489Wph(imagePath, scanAlgorithm);
        c83489Wph.LIZLLL = stickerId;
        obtain.obj = c83489Wph;
        obtain.what = 1002;
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = ((C83492Wpk) iDqS456S0100000_14.l0).LIZJ;
        if (iDHandlerS24S0100000_14 != null) {
            iDHandlerS24S0100000_14.sendMessage(obtain);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS456S0100000_14 iDqS456S0100000_14, Object obj, Object obj2, Object obj3, Object obj4) {
        String stickerId = (String) obj;
        String imagePath = (String) obj2;
        String scanAlgorithm = (String) obj3;
        int intValue = ((Number) obj4).intValue();
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(scanAlgorithm, "scanAlgorithm");
        Message obtain = Message.obtain();
        C83489Wph c83489Wph = new C83489Wph(imagePath, scanAlgorithm, intValue);
        c83489Wph.LIZLLL = stickerId;
        obtain.obj = c83489Wph;
        obtain.what = 1002;
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = ((C83492Wpk) iDqS456S0100000_14.l0).LIZJ;
        if (iDHandlerS24S0100000_14 != null) {
            iDHandlerS24S0100000_14.sendMessage(obtain);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS456S0100000_14 iDqS456S0100000_14, Object obj, Object obj2, Object obj3, Object recorder) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        o.LJIIIZ(recorder, "recorder");
        Iterator<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> it = ((C83902WwM) iDqS456S0100000_14.l0).LIZJ.iterator();
        while (it.hasNext()) {
            it.next().invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), obj3, recorder);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS456S0100000_14 iDqS456S0100000_14, Object obj, Object obj2, Object obj3, Object recorder) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        o.LJIIIZ(recorder, "recorder");
        if (!((C83860Wvg) iDqS456S0100000_14.l0).LJLZ.invoke().booleanValue()) {
            Iterator<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> it = ((C83860Wvg) iDqS456S0100000_14.l0).LJLJL.iterator();
            while (it.hasNext()) {
                it.next().invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), obj3, recorder);
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(IDqS456S0100000_14 iDqS456S0100000_14, Object obj, Object obj2, Object obj3, Object obj4) {
        iDqS456S0100000_14.invoke$0(((Boolean) obj).booleanValue(), (C83489Wph) obj2, (List) obj3, (Map) obj4);
        return C76800UCe.LIZ;
    }
}
