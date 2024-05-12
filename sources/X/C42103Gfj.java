package X;

import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42103Gfj extends AbstractC42096Gfc {
    public final C42104Gfk LIZLLL = new C42104Gfk(0);

    @Override // X.AbstractC42096Gfc
    public final /* bridge */ /* synthetic */ InterfaceC42095Gfb LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJI(Intent intent, EnumC42099Gff enumC42099Gff) {
        String str;
        AVChallenge aVChallenge;
        o.LJIIIZ(intent, "intent");
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("reuse_sticker_ids");
        ArrayList<String> LIZIZ = ID0.LIZIZ(C16880lQ.LLJJIJIIJIL(intent, "sticker_id"));
        ArrayList<String> LIZIZ2 = ID0.LIZIZ(C16880lQ.LLJJIJIIJIL(intent, "music_reuse_sticker_id"));
        if (stringArrayListExtra != null) {
            arrayList.addAll(SFS.LIZJ(stringArrayListExtra));
        }
        arrayList.addAll(SFS.LIZJ(LIZIZ));
        arrayList.addAll(SFS.LIZJ(LIZIZ2));
        Serializable serializableExtra = intent.getSerializableExtra("extra_open_record_challenge");
        String str2 = null;
        if ((serializableExtra instanceof AVChallenge) && (aVChallenge = (AVChallenge) serializableExtra) != null) {
            str = aVChallenge.challengeName;
            if (aVChallenge.getStickerId() != null) {
                String stickerId = aVChallenge.getStickerId();
                o.LJIIIIZZ(stickerId, "avChallenge.getStickerId()");
                arrayList.add(stickerId);
            }
        } else {
            str = null;
        }
        Mission mission = (Mission) intent.getParcelableExtra("mission_data");
        if (TextUtils.equals(C16880lQ.LLJJIJIIJIL(intent, "shoot_way"), "mission") && mission != null) {
            str2 = mission.getMissionId();
            String stickerId2 = mission.getStickerId();
            if (stickerId2 != null) {
                arrayList.add(stickerId2);
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        List LJIIJ = SFS.LJIIJ(SFS.LIZJ(arrayList));
        if (str == null) {
            str = "";
        }
        return new C42104Gfk((List<String>) LJIIJ, str, str2);
    }

    public static final boolean LJIIIIZZ(String str, EnumC42099Gff lastNodeName, EnumC42099Gff newNodeName) {
        o.LJIIIZ(lastNodeName, "lastNodeName");
        o.LJIIIZ(newNodeName, "newNodeName");
        if (newNodeName == EnumC42099Gff.ENTER_RECORD && lastNodeName == EnumC42099Gff.BEFORE_ENTER_RECORD) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJ(ShortVideoContext shortVideoContext, List<? extends InterfaceC42095Gfb> list, EnumC42099Gff enumC42099Gff) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC42095Gfb interfaceC42095Gfb : list) {
                if (interfaceC42095Gfb instanceof C42104Gfk) {
                    arrayList.add(interfaceC42095Gfb);
                }
            }
            C42104Gfk c42104Gfk = (C42104Gfk) ORZ.LJLLLL(arrayList);
            if (c42104Gfk != null) {
                return c42104Gfk;
            }
        }
        return this.LIZLLL;
    }

    @Override // X.AbstractC42096Gfc
    public final List<Object> LIZJ(InterfaceC42095Gfb interfaceC42095Gfb, InterfaceC42095Gfb interfaceC42095Gfb2, EnumC42099Gff lastNodeName, EnumC42099Gff newNodeName) {
        o.LJIIIZ(lastNodeName, "lastNodeName");
        o.LJIIIZ(newNodeName, "newNodeName");
        if (!(interfaceC42095Gfb instanceof C42104Gfk) || !(interfaceC42095Gfb2 instanceof C42104Gfk)) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (LJIIIIZZ("prop", lastNodeName, newNodeName)) {
            C42104Gfk c42104Gfk = (C42104Gfk) interfaceC42095Gfb2;
            C42104Gfk c42104Gfk2 = (C42104Gfk) interfaceC42095Gfb;
            if (!c42104Gfk.LJLIL.containsAll(c42104Gfk2.LJLIL)) {
                arrayList.add(new C42576GnM("prop", ORZ.LLD(c42104Gfk2.LJLIL, ",", null, null, null, 62), ORZ.LLD(c42104Gfk.LJLIL, ",", null, null, null, 62)));
            }
        }
        if (LJIIIIZZ("challenge", lastNodeName, newNodeName)) {
            C42104Gfk c42104Gfk3 = (C42104Gfk) interfaceC42095Gfb2;
            C42104Gfk c42104Gfk4 = (C42104Gfk) interfaceC42095Gfb;
            if (!TextUtils.equals(c42104Gfk3.LJLILLLLZI, c42104Gfk4.LJLILLLLZI)) {
                arrayList.add(new C42576GnM("challenge", c42104Gfk4.LJLILLLLZI, c42104Gfk3.LJLILLLLZI));
            }
        }
        if (LJIIIIZZ("mission", lastNodeName, newNodeName)) {
            C42104Gfk c42104Gfk5 = (C42104Gfk) interfaceC42095Gfb;
            if (c42104Gfk5.LJLJI.length() > 0) {
                C42104Gfk c42104Gfk6 = (C42104Gfk) interfaceC42095Gfb2;
                if (!o.LJ(c42104Gfk6.LJLJI, c42104Gfk5.LJLJI)) {
                    arrayList.add(new C42576GnM("mission", c42104Gfk5.LJLJI, c42104Gfk6.LJLJI));
                }
            }
        }
        return arrayList;
    }
}
