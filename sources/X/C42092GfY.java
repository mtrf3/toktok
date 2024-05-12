package X;

import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GfY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42092GfY extends AbstractC42096Gfc {
    public final C42093GfZ LIZLLL = new C42093GfZ(null, null, null, null, 15);

    @Override // X.AbstractC42096Gfc
    public final /* bridge */ /* synthetic */ InterfaceC42095Gfb LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJFF(VideoPublishEditModel model, EnumC42099Gff enumC42099Gff) {
        String str;
        List<AVTextExtraStruct> list;
        o.LJIIIZ(model, "model");
        if (enumC42099Gff == EnumC42099Gff.BEFORE_REAL_PUBLISH) {
            C60903NvH.LJIIJJI().getPublishService().LJIIJ();
            if (G8X.LIZ(model)) {
                list = model.creativeModel.postPageModel.captionModel.markupExtra;
            } else {
                list = model.creativeModel.postPageModel.markupExtra;
            }
            List LIZJ = SFS.LIZJ(list);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZJ, 10));
            Iterator it = LIZJ.iterator();
            while (it.hasNext()) {
                arrayList.add(((AVTextExtraStruct) it.next()).hashTagName);
            }
            return new C42093GfZ(null, null, null, SFS.LIZJ(arrayList), 7);
        }
        ArrayList arrayList2 = new ArrayList();
        List<AVChallenge> recordEffectChallenges = model.getRecordEffectChallenges();
        o.LJIIIIZZ(recordEffectChallenges, "model.recordEffectChallenges");
        arrayList2.addAll(recordEffectChallenges);
        AVChallenge recordChallenge = model.creativeModel.commerceModel.getRecordChallenge();
        List<String> list2 = null;
        if (recordChallenge == null || (str = recordChallenge.challengeName) == null) {
            str = "";
        }
        Mission mission = model.creativeModel.commerceModel.getMission();
        if (mission != null) {
            list2 = mission.getChallengeNames();
        }
        List LIZJ2 = SFS.LIZJ(list2);
        List LIZJ3 = SFS.LIZJ(arrayList2);
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(LIZJ3, 10));
        Iterator it2 = LIZJ3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AVChallenge) it2.next()).challengeName);
        }
        return new C42093GfZ(str, LIZJ2, SFS.LIZJ(arrayList3), null, 8);
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJII(LinkedHashMap publishMap, EnumC42099Gff enumC42099Gff) {
        String str;
        o.LJIIIZ(publishMap, "publishMap");
        Object obj = publishMap.get("text_extra");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            List LIZLLL = C75792yF.LIZLLL(AVTextExtraStruct[].class, str);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
            Iterator it = LIZLLL.iterator();
            while (it.hasNext()) {
                arrayList.add(((AVTextExtraStruct) it.next()).hashTagName);
            }
            return new C42093GfZ(null, null, null, SFS.LIZJ(arrayList), 7);
        }
        return this.LIZLLL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r1.equals("bring_in") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return X.C42100Gfg.LIZ.contains(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r1.equals("mission") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0011 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIIZZ(java.lang.String r1, X.EnumC42099Gff r2, X.EnumC42099Gff r3) {
        /*
            java.lang.String r0 = "lastNodeName"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "newNodeName"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 96673: goto L13;
                case 3449699: goto L25;
                case 203736818: goto L34;
                case 1069449612: goto L3d;
                default: goto L11;
            }
        L11:
            r0 = 0
        L12:
            return r0
        L13:
            java.lang.String r0 = "all"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1c
            goto L11
        L1c:
            X.Gff r0 = X.EnumC42099Gff.REAL_PUBLISH
            if (r3 != r0) goto L11
            X.Gff r0 = X.EnumC42099Gff.BEFORE_REAL_PUBLISH
            if (r2 != r0) goto L11
            goto L32
        L25:
            java.lang.String r0 = "prop"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            goto L11
        L2e:
            X.Gff r0 = X.EnumC42099Gff.ENTER_PUBLISH
            if (r3 != r0) goto L11
        L32:
            r0 = 1
            goto L12
        L34:
            java.lang.String r0 = "bring_in"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L46
            goto L11
        L3d:
            java.lang.String r0 = "mission"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L46
            goto L11
        L46:
            java.util.List<X.Gff> r0 = X.C42100Gfg.LIZ
            boolean r0 = r0.contains(r3)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42092GfY.LJIIIIZZ(java.lang.String, X.Gff, X.Gff):boolean");
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJ(ShortVideoContext shortVideoContext, List<? extends InterfaceC42095Gfb> list, EnumC42099Gff enumC42099Gff) {
        String str;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        AVChallenge recordChallenge = shortVideoContext.creativeModel.commerceModel.getRecordChallenge();
        List<String> list2 = null;
        if (recordChallenge == null || (str = recordChallenge.challengeName) == null) {
            str = "";
        }
        Mission mission = shortVideoContext.creativeModel.commerceModel.getMission();
        if (mission != null) {
            list2 = mission.getChallengeNames();
        }
        return new C42093GfZ(str, SFS.LIZJ(list2), null, null, 12);
    }

    @Override // X.AbstractC42096Gfc
    public final List<Object> LIZJ(InterfaceC42095Gfb interfaceC42095Gfb, InterfaceC42095Gfb interfaceC42095Gfb2, EnumC42099Gff lastNodeName, EnumC42099Gff newNodeName) {
        o.LJIIIZ(lastNodeName, "lastNodeName");
        o.LJIIIZ(newNodeName, "newNodeName");
        if (!(interfaceC42095Gfb instanceof C42093GfZ) || !(interfaceC42095Gfb2 instanceof C42093GfZ)) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(lastNodeName);
        LIZ.append('-');
        LIZ.append(newNodeName);
        String LIZIZ = X1D.LIZIZ(LIZ);
        boolean z = true;
        if (newNodeName == EnumC42099Gff.REAL_PUBLISH && !e1.LIZ(31744, "enable_fund_safety_monitor_publish_dialog", true, true) && !C211898Th.LIZ()) {
            z = false;
        }
        C42093GfZ c42093GfZ = (C42093GfZ) interfaceC42095Gfb;
        C42093GfZ c42093GfZ2 = (C42093GfZ) interfaceC42095Gfb2;
        String LIZIZ2 = C42090GfW.LIZIZ(c42093GfZ.LJLILLLLZI, c42093GfZ2.LJLILLLLZI, LJIIIIZZ("mission", lastNodeName, newNodeName));
        if (LIZIZ2 != null) {
            arrayList.add(new C42572GnI("mission", LIZIZ2, LIZIZ, z));
        }
        String LIZ2 = C42090GfW.LIZ(c42093GfZ.LJLIL, c42093GfZ2.LJLIL, LJIIIIZZ("bring_in", lastNodeName, newNodeName));
        if (LIZ2 != null) {
            arrayList.add(new C42572GnI("bring_in", LIZ2, LIZIZ, z));
        }
        String LIZIZ3 = C42090GfW.LIZIZ(c42093GfZ.LJLJI, c42093GfZ2.LJLJI, LJIIIIZZ("prop", lastNodeName, newNodeName));
        if (LIZIZ3 != null) {
            arrayList.add(new C42572GnI("prop", LIZIZ3, LIZIZ, z));
        }
        String LIZIZ4 = C42090GfW.LIZIZ(c42093GfZ.LJLJJI, c42093GfZ2.LJLJJI, LJIIIIZZ("all", lastNodeName, newNodeName));
        if (LIZIZ4 != null) {
            arrayList.add(new C42572GnI("all", LIZIZ4, LIZIZ, z));
        }
        return arrayList;
    }
}
