package X;

import com.bytedance.android.livesdk.dataChannel.ShowAudienceBottomLeftLinkWidgetChannel;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionFeatureToolbarChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.BtN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30209BtN {
    public static final java.util.Map<EnumC30204BtI, EnumC30208BtM> LJIIIIZZ = C113554cx.LJJL(new OSZ(EnumC30204BtI.MULTIGUEST, EnumC30208BtM.LINK_HOST), new OSZ(EnumC30204BtI.QUESTION, EnumC30208BtM.QUESTION), new OSZ(EnumC30204BtI.FAST_GIFT, EnumC30208BtM.FAST_GIFT), new OSZ(EnumC30204BtI.DUMMY_FAST_GIFT, EnumC30208BtM.DUMMY_FAST_GIFT), new OSZ(EnumC30204BtI.GIFT, EnumC30208BtM.GIFT), new OSZ(EnumC30204BtI.DUMMY_GIFT, EnumC30208BtM.DUMMY_GIFT), new OSZ(EnumC30204BtI.SHARE, EnumC30208BtM.SHARE), new OSZ(EnumC30204BtI.CUSTOM_POLL, EnumC30208BtM.CUSTOM_POLL), new OSZ(EnumC30204BtI.AUDIENCE_INTERACTION_FEATURES, EnumC30208BtM.INTERACTION));
    public final DataChannel LIZ;
    public final java.util.Set<EnumC30208BtM> LIZIZ;
    public final java.util.Set<EnumC30208BtM> LIZJ;
    public final java.util.Set<EnumC30208BtM> LIZLLL;
    public final java.util.Set<EnumC30208BtM> LJ;
    public final java.util.Set<EnumC30208BtM> LJFF;
    public final java.util.Map<EnumC30208BtM, EnumC30204BtI> LJI;
    public int LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        this.LJ.removeAll(this.LIZLLL);
        this.LJFF.removeAll(this.LIZLLL);
        this.LJFF.removeAll(this.LJ);
        if (this.LJFF.size() > this.LJII && this.LIZJ.size() >= 2) {
            for (Object obj : ORZ.LLIL(ORZ.LJZI(this.LIZJ, this.LJFF))) {
                if (this.LJFF.size() >= this.LJII) {
                    this.LJ.add(obj);
                    this.LJFF.remove(obj);
                }
            }
            if (this.LJ.size() > 0) {
                this.LJFF.add(EnumC30208BtM.INTERACTION);
            }
        }
        if (this.LJ.size() == 1 || this.LJFF.size() < this.LJII) {
            java.util.Set<EnumC30208BtM> set = this.LJ;
            o.LJIIIZ(set, "<this>");
            for (Object obj2 : ORZ.LLILII(C32064CiC.LJLIL, set)) {
                if (this.LJFF.size() < this.LJII) {
                    this.LJ.remove(obj2);
                    this.LJFF.add(obj2);
                }
            }
            if (this.LJ.size() == 1) {
                this.LJFF.addAll(this.LJ);
                this.LJ.clear();
            }
        }
    }

    public final void LIZJ() {
        java.util.Set<EnumC30208BtM> set = this.LIZLLL;
        EnumC30208BtM enumC30208BtM = EnumC30208BtM.LINK_HOST;
        if (set.contains(enumC30208BtM)) {
            EnumC30204BtI enumC30204BtI = (EnumC30204BtI) ((LinkedHashMap) this.LJI).get(enumC30208BtM);
            if (enumC30204BtI != null) {
                enumC30204BtI.hideBySwitchManager(this.LIZ);
            }
            this.LIZ.rv0(ShowAudienceBottomLeftLinkWidgetChannel.class, Boolean.TRUE);
        } else {
            this.LIZ.rv0(ShowAudienceBottomLeftLinkWidgetChannel.class, Boolean.FALSE);
        }
        if (this.LJ.size() > 0) {
            java.util.Set<EnumC30208BtM> set2 = this.LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<EnumC30208BtM> it = set2.iterator();
            while (it.hasNext()) {
                Object obj = ((LinkedHashMap) this.LJI).get(it.next());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((EnumC30204BtI) it2.next()).hideBySwitchManager(this.LIZ);
            }
            EnumC30204BtI.AUDIENCE_INTERACTION_FEATURES.showBySwitchManager(this.LIZ);
            this.LJFF.add(EnumC30208BtM.INTERACTION);
            this.LIZ.rv0(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.TRUE);
        } else {
            EnumC30204BtI.AUDIENCE_INTERACTION_FEATURES.hideBySwitchManager(this.LIZ);
            this.LJFF.remove(EnumC30208BtM.INTERACTION);
            this.LIZ.rv0(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.FALSE);
        }
        java.util.Set<EnumC30208BtM> set3 = this.LJFF;
        ArrayList arrayList2 = new ArrayList();
        Iterator<EnumC30208BtM> it3 = set3.iterator();
        while (it3.hasNext()) {
            Object obj2 = ((LinkedHashMap) this.LJI).get(it3.next());
            if (obj2 != null) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((EnumC30204BtI) it4.next()).showBySwitchManager(this.LIZ);
        }
    }

    public C30209BtN(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = dataChannel;
        this.LIZIZ = new LinkedHashSet();
        this.LIZJ = new LinkedHashSet();
        this.LIZLLL = new LinkedHashSet();
        this.LJ = new LinkedHashSet();
        this.LJFF = new LinkedHashSet();
        this.LJI = new LinkedHashMap();
        this.LJII = 5;
    }

    public final void LIZ(EnumC30208BtM function) {
        o.LJIIIZ(function, "function");
        if (!this.LIZIZ.contains(function)) {
            this.LIZIZ.add(function);
            if (function.isInteractionFunctions()) {
                this.LIZJ.add(function);
            }
            EnumC30208BtM enumC30208BtM = EnumC30208BtM.BOTTOM_LEFT_SLOT;
            if (function == enumC30208BtM || function == EnumC30208BtM.SUBSCRIPTION_ICON || function == EnumC30208BtM.AUDIENCE_SLOT) {
                this.LIZLLL.add(function);
                this.LJII = 5;
                if (this.LIZLLL.contains(enumC30208BtM)) {
                    this.LJII--;
                }
                if (this.LIZLLL.contains(EnumC30208BtM.SUBSCRIPTION_ICON)) {
                    this.LJII--;
                }
                if (this.LIZLLL.contains(EnumC30208BtM.AUDIENCE_SLOT)) {
                    this.LJII--;
                }
            } else {
                this.LJFF.add(function);
            }
            LIZIZ();
        }
        LIZJ();
    }

    public final void LIZLLL(EnumC30208BtM function) {
        o.LJIIIZ(function, "function");
        if (this.LIZIZ.contains(function)) {
            this.LIZIZ.remove(function);
            if (function.isInteractionFunctions()) {
                this.LIZJ.remove(function);
            }
            if (this.LIZLLL.contains(function)) {
                this.LIZLLL.remove(function);
                this.LJII = 5;
                if (this.LIZLLL.contains(EnumC30208BtM.BOTTOM_LEFT_SLOT)) {
                    this.LJII--;
                }
                if (this.LIZLLL.contains(EnumC30208BtM.SUBSCRIPTION_ICON)) {
                    this.LJII--;
                }
                if (this.LIZLLL.contains(EnumC30208BtM.AUDIENCE_SLOT)) {
                    this.LJII--;
                }
            } else if (this.LJ.contains(function)) {
                this.LJ.remove(function);
            } else {
                this.LJFF.remove(function);
            }
            LIZIZ();
        }
        LIZJ();
    }
}
