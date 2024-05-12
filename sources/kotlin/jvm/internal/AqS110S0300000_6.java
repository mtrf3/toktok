package kotlin.jvm.internal;

import X.AbstractC60240Nka;
import X.AbstractC65781Prl;
import X.BQ6;
import X.C03880Dg;
import X.C34K;
import X.C35604DyC;
import X.C35656Dz2;
import X.C37648Eq4;
import X.C37903EuB;
import X.C37904EuC;
import X.C37955Ev1;
import X.C37975EvL;
import X.C38511F9n;
import X.C39048FUe;
import X.C39982Fmc;
import X.C39984Fme;
import X.C40741Fyr;
import X.C40745Fyv;
import X.C60220NkG;
import X.C61295O3v;
import X.C61328O5c;
import X.C61898ORa;
import X.C65300Pk0;
import X.C76800UCe;
import X.EGQ;
import X.EnumC37644Eq0;
import X.EnumC39866Fkk;
import X.G04;
import X.G15;
import X.InterfaceC37454Emw;
import X.InterfaceC39983Fmd;
import X.InterfaceC88472Yns;
import X.O26;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.X1D;
import X.YBI;
import Y.ARunnableS42S0100000_6;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.Callback;
import com.ss.android.ugc.aweme.journey.events.NujComponentCompleteEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class AqS110S0300000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        OSZ item = (OSZ) obj;
        o.LJIIJ(item, "item");
        if (ORY.LJJIJIIJIL(item.getSecond(), (String[]) aqS110S0300000_6.l0)) {
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) ((Map.Entry) aqS110S0300000_6.l1).getKey());
        LIZ.append(" has wrong value.should be one of ");
        LIZ.append(C61898ORa.LJIILL((String[]) aqS110S0300000_6.l0));
        LIZ.append(" but got ");
        LIZ.append(aqS110S0300000_6.l2);
        throw new EGQ(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$1(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        OSZ item = (OSZ) obj;
        o.LJIIJ(item, "item");
        if (ORZ.LJLJJI(item.getSecond(), (List) aqS110S0300000_6.l0)) {
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) ((Map.Entry) aqS110S0300000_6.l1).getKey());
        LIZ.append(" has wrong value.should be one of ");
        LIZ.append((List) aqS110S0300000_6.l0);
        LIZ.append(" but got ");
        LIZ.append(aqS110S0300000_6.l2);
        throw new EGQ(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$10(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        O26 it = (O26) obj;
        o.LJIIJ(it, "it");
        BQ6 bq6 = (BQ6) aqS110S0300000_6.l1;
        ((C38511F9n) aqS110S0300000_6.l0).getClass();
        bq6.accept(C38511F9n.LIZLLL(it));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        C37648Eq4 c37648Eq4;
        EnumC37644Eq0 enumC37644Eq0;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIJ(it, "it");
        BQ6 bq6 = (BQ6) aqS110S0300000_6.l1;
        ((C38511F9n) aqS110S0300000_6.l0).getClass();
        if (it.LJZL) {
            if (it.LLFF) {
                enumC37644Eq0 = EnumC37644Eq0.Offline;
            } else {
                enumC37644Eq0 = EnumC37644Eq0.Online;
            }
            WebResourceResponse V = it.V();
            if (V != null) {
                c37648Eq4 = new C37648Eq4(V, enumC37644Eq0, it.LLD);
                bq6.accept(c37648Eq4);
                return C76800UCe.LIZ;
            }
        }
        c37648Eq4 = null;
        bq6.accept(c37648Eq4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        OSZ item = (OSZ) obj;
        o.LJIIJ(item, "item");
        if (ORZ.LJLJJI(item.getSecond(), (List) aqS110S0300000_6.l0)) {
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) ((Map.Entry) aqS110S0300000_6.l1).getKey());
        LIZ.append(" has wrong value.should be one of ");
        LIZ.append((List) aqS110S0300000_6.l0);
        LIZ.append(" but got ");
        LIZ.append(aqS110S0300000_6.l2);
        throw new EGQ(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$3(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        SensorManager sensorManager = (SensorManager) aqS110S0300000_6.l0;
        SensorEventListener sensorEventListener = (SensorEventListener) aqS110S0300000_6.l1;
        Sensor sensor = (Sensor) aqS110S0300000_6.l2;
        if (!new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{sensorEventListener, sensor}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V", "5482409979476565960")).LIZ) {
            sensorManager.unregisterListener(sensorEventListener, sensor);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C37903EuB c37903EuB = ((C37904EuC) ((LynxBridgeDelegateModule) aqS110S0300000_6.l0).getObj()).LIZ;
        if (c37903EuB == null) {
            return null;
        }
        c37903EuB.LIZ((C37955Ev1) aqS110S0300000_6.l1, new C37975EvL(aqS110S0300000_6, booleanValue), (C37904EuC) ((LynxBridgeDelegateModule) aqS110S0300000_6.l0).getObj(), null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        Uri it = (Uri) obj;
        o.LJIIJ(it, "it");
        ((AbstractC60240Nka) aqS110S0300000_6.l0).LJIILIIL(it, (InterfaceC88472Yns) aqS110S0300000_6.l1, (InterfaceC88472Yns) aqS110S0300000_6.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        InputStream inputStream;
        O26 it = (O26) obj;
        o.LJIIJ(it, "it");
        try {
            File LIZIZ = O26.LIZIZ(it);
            C39982Fmc c39982Fmc = (C39982Fmc) aqS110S0300000_6.l0;
            if (LIZIZ.exists()) {
                inputStream = new FileInputStream(LIZIZ);
            } else {
                inputStream = it.LJIIL;
                if (inputStream == null) {
                    inputStream = null;
                }
            }
            c39982Fmc.LIZJ = inputStream;
            InterfaceC39983Fmd interfaceC39983Fmd = (InterfaceC39983Fmd) aqS110S0300000_6.l1;
            if (interfaceC39983Fmd != null) {
                interfaceC39983Fmd.LIZ((C39982Fmc) aqS110S0300000_6.l0);
            }
        } catch (Throwable th) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request ");
            c39048FUe.LIZ(C61328O5c.LIZLLL(LIZ, ((C39984Fme) aqS110S0300000_6.l2).LIZ, " failed, ", th, LIZ), EnumC39866Fkk.E, "DefaultLynxRequestProvider");
            InterfaceC39983Fmd interfaceC39983Fmd2 = (InterfaceC39983Fmd) aqS110S0300000_6.l1;
            if (interfaceC39983Fmd2 != null) {
                interfaceC39983Fmd2.LIZIZ((C39982Fmc) aqS110S0300000_6.l0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request ");
        c39048FUe.LIZ(C61328O5c.LIZLLL(LIZ, ((C39984Fme) aqS110S0300000_6.l0).LIZ, " failed, ", it, LIZ), EnumC39866Fkk.E, "DefaultLynxRequestProvider");
        InterfaceC39983Fmd interfaceC39983Fmd = (InterfaceC39983Fmd) aqS110S0300000_6.l1;
        if (interfaceC39983Fmd != null) {
            interfaceC39983Fmd.LIZIZ((C39982Fmc) aqS110S0300000_6.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        InputStream U;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIJ(it, "it");
        if (it.LJZL && (U = it.U()) != null) {
            C39982Fmc c39982Fmc = (C39982Fmc) aqS110S0300000_6.l0;
            c39982Fmc.LIZJ = U;
            InterfaceC39983Fmd interfaceC39983Fmd = (InterfaceC39983Fmd) aqS110S0300000_6.l1;
            if (interfaceC39983Fmd != null) {
                interfaceC39983Fmd.LIZ(c39982Fmc);
            }
        } else {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request ");
            LIZ.append(((C39984Fme) aqS110S0300000_6.l2).LIZ);
            LIZ.append(" failed, ");
            LIZ.append(it.LL);
            c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.E, "DefaultLynxRequestProvider");
            InterfaceC39983Fmd interfaceC39983Fmd2 = (InterfaceC39983Fmd) aqS110S0300000_6.l1;
            if (interfaceC39983Fmd2 != null) {
                interfaceC39983Fmd2.LIZIZ((C39982Fmc) aqS110S0300000_6.l0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS110S0300000_6 aqS110S0300000_6, Object obj) {
        C40745Fyv c40745Fyv = (C40745Fyv) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((G04) aqS110S0300000_6.l0).type());
        LIZ.append(" complete execute,isHandleComplete:");
        LIZ.append(((C34K) aqS110S0300000_6.l1).element);
        LIZ.append(",event:");
        LIZ.append(c40745Fyv);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        NujComponentCompleteEvent nujComponentCompleteEvent = new NujComponentCompleteEvent();
        nujComponentCompleteEvent.LIZLLL(Integer.valueOf(((C34K) aqS110S0300000_6.l1).element ? 1 : 0), "is_handle_complete");
        String componentName = ((G04) aqS110S0300000_6.l0).type().getDesc();
        o.LJIIIZ(componentName, "componentName");
        nujComponentCompleteEvent.LIZLLL(componentName, "component_name");
        nujComponentCompleteEvent.LJFF();
        if (!((C34K) aqS110S0300000_6.l1).element) {
            ((G15) aqS110S0300000_6.l2).LIZJ(new AqS137S0200000_6((G04) aqS110S0300000_6.l0, (G04<C35656Dz2>) c40745Fyv, (C40745Fyv) 40));
            ((C34K) aqS110S0300000_6.l1).element = true;
            C35604DyC.LIZ(new ARunnableS42S0100000_6((G15) aqS110S0300000_6.l2, 145));
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS110S0300000_6(X.InterfaceC39983Fmd r3, X.C39984Fme r4, X.C39982Fmc r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 6: goto L11;
                case 7: goto L5;
                case 8: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS110S0300000_6.<init>(X.Fmd, X.Fme, X.Fmc, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS110S0300000_6(G04 g04, G04<C35656Dz2> g042, C34K c34k, G15 g15) {
        super(1);
        this.$t = g15;
        this.l0 = g04;
        this.l1 = g042;
        this.l2 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0300000_6(AbstractC60240Nka abstractC60240Nka, C60220NkG c60220NkG, AqS15S0500000_10 aqS15S0500000_10, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC60240Nka;
        this.l1 = c60220NkG;
        this.l2 = aqS15S0500000_10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0300000_6(SensorManager sensorManager, YBI ybi, Sensor sensor, int i) {
        super(1);
        this.$t = i;
        this.l0 = sensorManager;
        this.l1 = ybi;
        this.l2 = sensor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0300000_6(LynxBridgeDelegateModule lynxBridgeDelegateModule, C37955Ev1 c37955Ev1, Callback callback, int i) {
        super(1);
        this.$t = i;
        this.l0 = lynxBridgeDelegateModule;
        this.l1 = c37955Ev1;
        this.l2 = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0300000_6(List list, Map.Entry entry, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = entry;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0300000_6(String[] strArr, Map.Entry entry, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = strArr;
        this.l1 = entry;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0300000_6(C38511F9n c38511F9n, InterfaceC37454Emw interfaceC37454Emw, BQ6 bq6, BQ6 bq62, int i) {
        super(1);
        this.$t = i;
        this.l0 = c38511F9n;
        this.l1 = bq6;
        this.l2 = bq62;
    }
}
