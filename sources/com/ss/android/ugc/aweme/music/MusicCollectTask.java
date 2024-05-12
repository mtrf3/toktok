package com.ss.android.ugc.aweme.music;

import X.C0RN;
import X.C199097rd;
import X.C213358Yx;
import X.C2U8;
import X.C42625Go9;
import X.C72818Shy;
import X.C76052yf;
import X.C78528Urs;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC78522Urm;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC78505UrV;
import X.QD3;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class MusicCollectTask implements EE1, InterfaceC72822Si2 {
    public String LJLIL = "";
    public int LJLILLLLZI = -1;

    @Override // X.EEY
    public final String key() {
        return "MusicCollectTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C213358Yx event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL, this.LJLIL) && this.LJLILLLLZI == event.LJLILLLLZI) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str = event.LJLIL;
        this.LJLIL = str;
        this.LJLILLLLZI = event.LJLILLLLZI;
        jSONObject.put("music_id", str);
        jSONObject.put("collect_status", event.LJLILLLLZI);
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), "music_chart_collect_sync_event"));
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        if (o.LJ(c199097rd.LJLIL, "music_chart_collect_sync_event") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null && interfaceC78280Uns.hasKey("music_id") && interfaceC78280Uns.hasKey("collect_status")) {
            InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns.get("music_id");
            InterfaceC78505UrV interfaceC78505UrV2 = interfaceC78280Uns.get("collect_status");
            if (interfaceC78505UrV.getType() == EnumC78522Urm.String && interfaceC78505UrV2.getType() == EnumC78522Urm.Int) {
                String asString = interfaceC78505UrV.asString();
                int asInt = interfaceC78505UrV2.asInt();
                if (o.LJ(asString, this.LJLIL) && asInt == this.LJLILLLLZI) {
                    return;
                }
                this.LJLIL = asString;
                this.LJLILLLLZI = asInt;
                C2U8.LIZ(new C213358Yx(asString, asInt, true));
            }
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        C42625Go9.LIZIZ(this);
        C72818Shy.LIZLLL("music_chart_collect_sync_event", this);
    }
}
