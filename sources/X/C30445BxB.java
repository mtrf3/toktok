package X;

import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.uikit.reddot.RedDotManager$decision$1$1", f = "RedDotManager.kt", l = {103, 190}, m = "invokeSuspend")
/* renamed from: X.BxB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30445BxB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30445BxB(boolean z, InterfaceC67352kd<? super C30445BxB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C30445BxB(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, X.Bwc] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        String str;
        ConcurrentHashMap LIZIZ;
        HashSet LIZ;
        int i;
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig;
        Long LJJIZ;
        HashSet LIZ2;
        int i2;
        Integer LJJIL;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i3 = this.LJLIL;
        long j2 = 0;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    C141335gf.LIZJ(obj);
                    C30446BxC.LJ = false;
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            List<? extends EnumC30410Bwc> list = C30446BxC.LJI;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<? extends EnumC30410Bwc> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().isDynamic()) {
                        if (!this.LJLILLLLZI) {
                            j = 2000;
                        }
                    }
                }
            }
            j = 0;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        List<? extends EnumC30410Bwc> list2 = C30446BxC.LJI;
        ArrayList arrayList = new ArrayList();
        for (EnumC30410Bwc enumC30410Bwc : list2) {
            EnumC30410Bwc enumC30410Bwc2 = enumC30410Bwc;
            if (!C30446BxC.LJIIIIZZ || (!enumC30410Bwc2.getLiveMessagePlatformRedDotConfig().getNewUserBlock() && enumC30410Bwc2.getLiveMessagePlatformRedDotConfig().getPriority() == EnumC124174u5.PRIORITY_MUST_SHOW.getPriority())) {
                arrayList.add(enumC30410Bwc);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            EnumC30410Bwc enumC30410Bwc3 = (EnumC30410Bwc) next;
            java.util.Set<String> LIZJ = InterfaceC30442Bx8.I1.LIZJ();
            o.LJIIIZ(enumC30410Bwc3, "<this>");
            if (!LIZJ.contains(enumC30410Bwc3.getCurrentId()) && enumC30410Bwc3.isValid()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            EnumC30410Bwc enumC30410Bwc4 = (EnumC30410Bwc) next2;
            if (enumC30410Bwc4.getLiveMessagePlatformRedDotConfig().getLifetime() != 0) {
                C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.H1;
                java.util.Map<String, String> LIZJ2 = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_RED_DOT_SHOWN_VERSION_RECORD.value");
                if (LIZJ2.containsKey(enumC30410Bwc4.getCurrentId())) {
                    java.util.Map<String, String> LIZJ3 = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ3, "LIVE_RED_DOT_SHOWN_VERSION_RECORD.value");
                    if (LIZJ3.containsKey(enumC30410Bwc4.getCurrentId())) {
                        int i4 = C30446BxC.LJIIIZ;
                        String str2 = c48459J0d.LIZJ().get(enumC30410Bwc4.getCurrentId());
                        if (str2 != null && (LJJIL = C38350F3i.LJJIL(str2)) != null) {
                            i2 = LJJIL.intValue();
                        } else {
                            i2 = 0;
                        }
                        if (i4 - i2 < enumC30410Bwc4.getLiveMessagePlatformRedDotConfig().getLifetime() * 100) {
                        }
                    }
                }
            }
            arrayList3.add(next2);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            EnumC30410Bwc enumC30410Bwc5 = (EnumC30410Bwc) next3;
            if (!enumC30410Bwc5.isDynamic() || (enumC30410Bwc5.isDynamic() && InterfaceC30442Bx8.T1.LIZJ().containsKey(enumC30410Bwc5.getCurrentId()))) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            Object next4 = it5.next();
            if (((EnumC30410Bwc) next4).getLiveMessagePlatformRedDotConfig().getPriority() == EnumC124174u5.PRIORITY_MUST_SHOW.getPriority()) {
                arrayList5.add(next4);
            }
        }
        if (!arrayList5.isEmpty()) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                EnumC30410Bwc enumC30410Bwc6 = (EnumC30410Bwc) it6.next();
                ConcurrentHashMap LIZIZ2 = C30446BxC.LIZIZ(C30446BxC.LIZ);
                if (LIZIZ2 != null) {
                    o.LJIIIZ(enumC30410Bwc6, "<this>");
                    LIZIZ2.put(enumC30410Bwc6.getCurrentId(), enumC30410Bwc6);
                    List<String> outLayerList = enumC30410Bwc6.getLiveMessagePlatformRedDotConfig().getOutLayerList();
                    if (outLayerList != null) {
                        for (String str3 : outLayerList) {
                            if (!InterfaceC30442Bx8.I1.LIZJ().contains(str3) && (LIZ2 = C30446BxC.LIZ(C30446BxC.LIZ)) != null) {
                                LIZ2.add(str3);
                            }
                        }
                    }
                }
            }
        }
        C30446BxC.LIZ.getClass();
        java.util.Map<String, String> LIZJ4 = InterfaceC30442Bx8.J1.LIZJ();
        EnumC30414Bwg enumC30414Bwg = C30446BxC.LJFF;
        if (enumC30414Bwg != null) {
            str = enumC30414Bwg.page;
        } else {
            str = null;
        }
        String str4 = LIZJ4.get(str);
        if (str4 != null && (LJJIZ = C38350F3i.LJJIZ(str4)) != null) {
            j2 = LJJIZ.longValue();
        }
        if (((int) (j2 / 86400000)) != ((int) (System.currentTimeMillis() / 86400000))) {
            ArrayList arrayList6 = new ArrayList();
            Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                Object next5 = it7.next();
                if (((EnumC30410Bwc) next5).getLiveMessagePlatformRedDotConfig().getPriority() != EnumC124174u5.PRIORITY_MUST_SHOW.getPriority()) {
                    arrayList6.add(next5);
                }
            }
            if (!arrayList6.isEmpty()) {
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = ListProtector.get(arrayList6, 0);
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    ?? r2 = (EnumC30410Bwc) it8.next();
                    EnumC30410Bwc enumC30410Bwc7 = (EnumC30410Bwc) c68322mC.element;
                    if (enumC30410Bwc7 != null && (liveMessagePlatformRedDotConfig = enumC30410Bwc7.getLiveMessagePlatformRedDotConfig()) != null) {
                        i = liveMessagePlatformRedDotConfig.getPriority();
                    } else {
                        i = 5;
                    }
                    if (i > r2.getLiveMessagePlatformRedDotConfig().getPriority()) {
                        c68322mC.element = r2;
                    }
                }
                EnumC30410Bwc enumC30410Bwc8 = (EnumC30410Bwc) c68322mC.element;
                if (enumC30410Bwc8 != null && (LIZIZ = C30446BxC.LIZIZ(C30446BxC.LIZ)) != null) {
                    LIZIZ.put(enumC30410Bwc8.getCurrentId(), enumC30410Bwc8);
                    List<String> outLayerList2 = enumC30410Bwc8.getLiveMessagePlatformRedDotConfig().getOutLayerList();
                    if (outLayerList2 != null) {
                        for (String str5 : outLayerList2) {
                            if (!InterfaceC30442Bx8.I1.LIZJ().contains(str5) && (LIZ = C30446BxC.LIZ(C30446BxC.LIZ)) != null) {
                                LIZ.add(str5);
                            }
                        }
                    }
                }
            }
        }
        HashSet LIZ3 = C30446BxC.LIZ(C30446BxC.LIZ);
        if (LIZ3 != null) {
            EnumC30410Bwc[] values = EnumC30410Bwc.values();
            ArrayList arrayList7 = new ArrayList();
            for (EnumC30410Bwc enumC30410Bwc9 : values) {
                if (ORY.LJJIJIIJIL(C30446BxC.LJFF, enumC30410Bwc9.getLivePage())) {
                    arrayList7.add(enumC30410Bwc9);
                }
            }
            Iterator it9 = arrayList7.iterator();
            while (it9.hasNext()) {
                EnumC30410Bwc enumC30410Bwc10 = (EnumC30410Bwc) it9.next();
                for (String str6 : enumC30410Bwc10.getIds()) {
                    if (LIZ3.contains(str6)) {
                        enumC30410Bwc10.setCurrentId(str6);
                    }
                }
            }
        }
        if (C30446BxC.LJIIJ) {
            C30446BxC c30446BxC = C30446BxC.LIZ;
            c30446BxC.getClass();
            StringBuilder sb = new StringBuilder();
            ConcurrentHashMap LIZIZ3 = C30446BxC.LIZIZ(c30446BxC);
            if (LIZIZ3 != null) {
                for (Map.Entry entry : LIZIZ3.entrySet()) {
                    sb.append("function_red_dot:");
                    List<String> outLayerList3 = ((EnumC30410Bwc) C1FJ.LIZJ(sb, (String) entry.getKey(), "\n", entry)).getLiveMessagePlatformRedDotConfig().getOutLayerList();
                    if (outLayerList3 != null) {
                        sb.append("guide:");
                        Iterator<String> it10 = outLayerList3.iterator();
                        while (it10.hasNext()) {
                            sb.append(it10.next());
                            sb.append("  ");
                        }
                    }
                }
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "s.toString()");
            C0NB.LIZIZ("red_dot_decision_result", sb2);
        }
        DataChannel LIZJ5 = C30446BxC.LIZJ(C30446BxC.LIZ);
        if (LIZJ5 != null) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C30447BxD c30447BxD = new C30447BxD(LIZJ5, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, c30447BxD, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C30446BxC.LJ = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
