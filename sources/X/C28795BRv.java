package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BRv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28795BRv extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ List<RedEnvelopeMessage4FE> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ RedEnvelopeWidget LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i;
        String str;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        Integer num;
        String str2;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        o.LJIIIZ(animation, "animation");
        List<RedEnvelopeMessage4FE> list = this.LJLILLLLZI;
        if (list != null) {
            String dataFrom = this.LJLJI;
            Boolean valueOf = Boolean.valueOf(this.LJLJJI.LJZ().isAnchor());
            o.LJIIIZ(dataFrom, "dataFrom");
            HashMap hashMap = new HashMap(11);
            hashMap.put("envelope_id", C28792BRs.LIZIZ);
            hashMap.put("time_stamp", String.valueOf(C30725C4b.LIZ()));
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            B83 LIZ = B83.LIZ();
            if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
            }
            ArrayList arrayList = new ArrayList();
            Iterator<RedEnvelopeMessage4FE> it = list.iterator();
            while (it.hasNext()) {
                RedEnvelopInfo4FE redEnvelopInfo4FE2 = it.next().envelopInfo;
                if (redEnvelopInfo4FE2 == null || (str2 = redEnvelopInfo4FE2.envelopeId) == null) {
                    str2 = "";
                }
                arrayList.add(str2);
            }
            if (list.size() >= 0 && (redEnvelopInfo4FE = ((RedEnvelopeMessage4FE) ListProtector.get(list, 0)).envelopInfo) != null && (num = redEnvelopInfo4FE.businessType) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            hashMap.put("business_type", String.valueOf(i));
            if (o.LJ(valueOf, Boolean.TRUE)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_anchor", str);
            hashMap.put("data_from", dataFrom);
            String abstractCollection = arrayList.toString();
            o.LJIIIIZZ(abstractCollection, "envelopeIdList.toString()");
            hashMap.put("envelope_id_list", abstractCollection);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_treasure_box_short_touch_finish");
            LIZ2.LJJIFFI(hashMap);
            LIZ2.LJIIZILJ();
            LIZ2.LJIIJJI("live_detail");
            LIZ2.LJIIL("click");
            LIZ2.LJIIIZ("live");
            LIZ2.LJJIIJZLJL();
            C0K2.LJII(0, "ttlive_treasure_box_short_touch_finish", hashMap);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        long j;
        boolean z;
        int i;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        Integer num;
        String str;
        o.LJIIIZ(animation, "animation");
        this.LJLIL.setPivotX(C15380j0.LIZ(35.0f));
        this.LJLIL.setPivotY(C15380j0.LIZ(35.0f));
        List<RedEnvelopeMessage4FE> list = this.LJLILLLLZI;
        if (list != null) {
            String dataFrom = this.LJLJI;
            Boolean valueOf = Boolean.valueOf(this.LJLJJI.LJZ().isAnchor());
            o.LJIIIZ(dataFrom, "dataFrom");
            HashMap hashMap = new HashMap(11);
            try {
                j = C30725C4b.LIZ() - CastLongProtector.parseLong(C28792BRs.LIZ);
            } catch (Throwable unused) {
                j = 0;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<RedEnvelopeMessage4FE> it = list.iterator();
            while (it.hasNext()) {
                RedEnvelopInfo4FE redEnvelopInfo4FE2 = it.next().envelopInfo;
                if (redEnvelopInfo4FE2 == null || (str = redEnvelopInfo4FE2.envelopeId) == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            if (valueOf != null) {
                z = valueOf.booleanValue();
            } else {
                z = false;
            }
            hashMap.put("is_anchor", String.valueOf(z));
            hashMap.put("duration", String.valueOf(j));
            hashMap.put("envelope_id", C28792BRs.LIZIZ);
            hashMap.put("data_from", dataFrom);
            String abstractCollection = arrayList.toString();
            o.LJIIIIZZ(abstractCollection, "envelopeIdList.toString()");
            hashMap.put("envelope_id_list", abstractCollection);
            if ((!list.isEmpty()) && (redEnvelopInfo4FE = ((RedEnvelopeMessage4FE) ListProtector.get(list, 0)).envelopInfo) != null && (num = redEnvelopInfo4FE.businessType) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            hashMap.put("business_type", String.valueOf(i));
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            B83 LIZ = B83.LIZ();
            if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_treasure_box_short_touch_pushin");
            LIZ2.LJJIFFI(hashMap);
            LIZ2.LJIIZILJ();
            LIZ2.LJIIJJI("live_detail");
            LIZ2.LJIIL("click");
            LIZ2.LJIIIZ("live");
            LIZ2.LJJIIJZLJL();
            C0K2.LJII(0, "ttlive_treasure_box_short_touch_pushin", hashMap);
        }
    }

    public C28795BRv(ViewGroup viewGroup, List<RedEnvelopeMessage4FE> list, String str, RedEnvelopeWidget redEnvelopeWidget) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = list;
        this.LJLJI = str;
        this.LJLJJI = redEnvelopeWidget;
    }
}
