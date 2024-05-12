package kotlin.jvm.internal;

import X.AbstractC49155JQx;
import X.AbstractC65781Prl;
import X.C48909JHl;
import X.C48935JIl;
import X.C48942JIs;
import X.C49153JQv;
import X.C49344JYe;
import X.C49877Jhp;
import X.C68322mC;
import X.C76800UCe;
import X.C8NH;
import X.InterfaceC49025JLx;
import X.InterfaceC87283bg;
import X.InterfaceC88472Yns;
import X.JGU;
import X.JIB;
import X.JKG;
import X.JMI;
import X.JMP;
import X.JUK;
import X.JYZ;
import X.X1D;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.google.gson.g;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public class AqS112S0300000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS112S0300000_8 aqS112S0300000_8, Object obj) {
        Integer num;
        Map map = (Map) obj;
        o.LJIIIZ(map, "map");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getKey()).intValue() < ((Number) ((C68322mC) aqS112S0300000_8.l0).element).intValue() || ((Number) entry.getKey()).intValue() > ((Number) ((C68322mC) aqS112S0300000_8.l1).element).intValue()) {
                it.remove();
                RecyclerView.ViewHolder viewHolder = ((C49344JYe) entry.getValue()).LIZJ;
                if (viewHolder != null) {
                    ((JYZ) aqS112S0300000_8.l2).LIZ.getRecycledViewPool().putRecycledView(viewHolder);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("remove cache - type=");
                RecyclerView.ViewHolder viewHolder2 = ((C49344JYe) entry.getValue()).LIZJ;
                if (viewHolder2 != null) {
                    num = Integer.valueOf(viewHolder2.getItemViewType());
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append(", ");
                LIZ.append(entry.getValue());
                X1D.LIZIZ(LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS112S0300000_8 aqS112S0300000_8, Object obj) {
        C8NH reusedUiSlotAssem = (C8NH) obj;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        JMI jmi = ((JMP) aqS112S0300000_8.l0).LIZ;
        if (jmi != null) {
            InterfaceC87283bg interfaceC87283bg = jmi.LIZIZ;
            if (interfaceC87283bg != null) {
                ((Assembler) aqS112S0300000_8.l1).nv0((SearchSingleCardTemplateAssem) aqS112S0300000_8.l2, new AqS170S0100000_4(interfaceC87283bg, 772));
            }
            JMI jmi2 = ((JMP) aqS112S0300000_8.l0).LIZ;
            if (jmi2 != null) {
                reusedUiSlotAssem.LJ(jmi2.LIZ);
                reusedUiSlotAssem.LIZLLL = R.id.dge;
                return C76800UCe.LIZ;
            }
            o.LJIJI("contentAssem");
            throw null;
        }
        o.LJIJI("contentAssem");
        throw null;
    }

    public static final Object invoke$2(AqS112S0300000_8 aqS112S0300000_8, Object obj) {
        C8NH reusedUiSlotAssem = (C8NH) obj;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        JMI jmi = ((JMP) aqS112S0300000_8.l0).LIZIZ;
        if (jmi != null) {
            InterfaceC87283bg interfaceC87283bg = jmi.LIZIZ;
            if (interfaceC87283bg != null) {
                ((Assembler) aqS112S0300000_8.l1).nv0((SearchSingleCardTemplateAssem) aqS112S0300000_8.l2, new AqS170S0100000_4(interfaceC87283bg, 773));
            }
            JMI jmi2 = ((JMP) aqS112S0300000_8.l0).LIZIZ;
            if (jmi2 != null) {
                reusedUiSlotAssem.LJ(jmi2.LIZ);
                reusedUiSlotAssem.LIZLLL = R.id.g5s;
                return C76800UCe.LIZ;
            }
            o.LJIJI("bottomAssem");
            throw null;
        }
        o.LJIJI("bottomAssem");
        throw null;
    }

    public static final Object invoke$3(AqS112S0300000_8 aqS112S0300000_8, Object obj) {
        C49877Jhp c49877Jhp = (C49877Jhp) aqS112S0300000_8.l0;
        c49877Jhp.LIZ((g) obj, c49877Jhp.LJLJJLL.LJ(c49877Jhp.LJLJLLL), (InterfaceC88472Yns) aqS112S0300000_8.l1, (InterfaceC88472Yns) aqS112S0300000_8.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS112S0300000_8 aqS112S0300000_8, Object obj) {
        C48935JIl dataProvider;
        C48935JIl dataProvider2;
        C48935JIl dataProvider3;
        C48935JIl dataProvider4;
        C48942JIs searchLiveVideoPlayHelper = (C48942JIs) obj;
        o.LJIIIZ(searchLiveVideoPlayHelper, "$this$searchLiveVideoPlayHelper");
        searchLiveVideoPlayHelper.LIZ(new AqS158S0100000_8((JKG) aqS112S0300000_8.l0, 498));
        ((JKG) aqS112S0300000_8.l0).c0().setOutCorner(true);
        C49153JQv c49153JQv = ((JKG) aqS112S0300000_8.l0).LJLJLJ;
        if (c49153JQv != null) {
            AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(c49153JQv, 499);
            JUK juk = searchLiveVideoPlayHelper.LJLIL;
            if (juk != null && (dataProvider4 = juk.getDataProvider()) != null) {
                dataProvider4.LIZJ = (C49153JQv) aqS158S0100000_8.invoke();
            }
        }
        JIB jib = (JIB) aqS112S0300000_8.l1;
        new AqS158S0100000_8(jib, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        JUK juk2 = searchLiveVideoPlayHelper.LJLIL;
        if (juk2 != null && (dataProvider3 = juk2.getDataProvider()) != null) {
            dataProvider3.LIZ = jib;
        }
        JGU jgu = (JGU) aqS112S0300000_8.l2;
        new AqS158S0100000_8(jgu, 501);
        JUK juk3 = searchLiveVideoPlayHelper.LJLIL;
        if (juk3 != null && (dataProvider2 = juk3.getDataProvider()) != null) {
            dataProvider2.LIZIZ = jgu;
        }
        JKG jkg = (JKG) aqS112S0300000_8.l0;
        AqS139S0200000_8 aqS139S0200000_8 = new AqS139S0200000_8(searchLiveVideoPlayHelper, jkg, 29);
        C48909JHl c48909JHl = new C48909JHl();
        aqS139S0200000_8.invoke(c48909JHl);
        jkg.LLIIIL = c48909JHl;
        AqS158S0100000_8 aqS158S0100000_82 = new AqS158S0100000_8((JKG) aqS112S0300000_8.l0, 506);
        JUK juk4 = searchLiveVideoPlayHelper.LJLIL;
        if (juk4 != null && (dataProvider = juk4.getDataProvider()) != null) {
            dataProvider.LIZLLL = (AbstractC49155JQx) aqS158S0100000_82.invoke();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS112S0300000_8(C68322mC c68322mC, C68322mC<Integer> c68322mC2, C68322mC<Integer> c68322mC3, JYZ<T> jyz) {
        super(1);
        this.$t = jyz;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = c68322mC3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS112S0300000_8(JKG jkg, JIB jib, JGU jgu, int i) {
        super(1);
        this.$t = i;
        this.l0 = jkg;
        this.l1 = jib;
        this.l2 = jgu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS112S0300000_8(JMP jmp, JMP<InterfaceC49025JLx> jmp2, Assembler assembler, SearchSingleCardTemplateAssem<InterfaceC49025JLx> searchSingleCardTemplateAssem) {
        super(1);
        this.$t = searchSingleCardTemplateAssem;
        this.l0 = jmp;
        this.l1 = jmp2;
        this.l2 = assembler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS112S0300000_8(C49877Jhp c49877Jhp, AqS174S0100000_8 aqS174S0100000_8, AqS174S0100000_8 aqS174S0100000_82, int i) {
        super(1);
        this.$t = i;
        this.l0 = c49877Jhp;
        this.l1 = aqS174S0100000_8;
        this.l2 = aqS174S0100000_82;
    }
}
