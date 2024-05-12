package com.ss.android.ugc.aweme.inbox.lego;

import X.C0RN;
import X.C113554cx;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.M9Q;
import X.OSZ;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class PreloadInboxTask implements EE1 {
    public static volatile boolean LJLIL;
    public static volatile boolean LJLILLLLZI;
    public static final Map<Integer, String> LJLJI = C113554cx.LJJL(new OSZ(Integer.valueOf(R.layout.rt), "awemenotice_fragment_navigation_container"), new OSZ(Integer.valueOf(R.layout.rs), "awemenotice_fragment_inbox_layout"), new OSZ(Integer.valueOf(R.layout.ry), "awemenotice_inbox_activity_notice"), new OSZ(Integer.valueOf(R.layout.tf), "awemenotice_mus_item_notification_template"), new OSZ(Integer.valueOf(R.layout.t_), "awemenotice_mus_item_notification_likes_new"), new OSZ(Integer.valueOf(R.layout.sy), "awemenotice_mus_item_notification_comments_new"), new OSZ(Integer.valueOf(R.layout.s7), "awemenotice_inbox_item_activity_entrance"), new OSZ(Integer.valueOf(R.layout.s8), "awemenotice_inbox_message_title"), new OSZ(Integer.valueOf(R.layout.s4), "awemenotice_inbox_follow_request_exposed"), new OSZ(Integer.valueOf(R.layout.s3), "awemenotice_inbox_follow_request"));

    @Override // X.EEY
    public final String key() {
        return "PreloadInboxTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        M9Q.LIZIZ();
    }
}
