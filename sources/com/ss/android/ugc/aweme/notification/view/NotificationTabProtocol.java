package com.ss.android.ugc.aweme.notification.view;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C45804HyK;
import X.C53986LGs;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C72972SkS;
import X.EnumC53761L8b;
import X.LH6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.base.CustomDotAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NotificationTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 475));
    public final LH6 LJLJJL = new LH6(new C53986LGs(R.drawable.z7, R.attr.go), new C53986LGs(R.drawable.z9, R.attr.dj), new C53986LGs(R.drawable.z8, R.attr.gv), new C53986LGs(R.drawable.z9, R.attr.dl), Integer.valueOf(R.id.gc1));
    public final String LJLJJLL = "NOTIFICATION";
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 476));
    public final EnumC53761L8b LJLJLJ = EnumC53761L8b.TAB_4;
    public final String LJLJLLL = "notification_page";

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return (Class) this.LJLJL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC53761L8b LIZLLL() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String LJIIIZ() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJFF(Context context) {
        CustomDotAbility customDotAbility;
        o.LJIIIZ(context, "context");
        ((View.OnClickListener) this.LJLJJI.getValue()).onClick(null);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (customDotAbility = (CustomDotAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), CustomDotAbility.class, null)) != null) {
            customDotAbility.l40();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle d(Context context) {
        Intent intent;
        Bundle LLJJIJI;
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null || (intent = LJIJJ.getIntent()) == null || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null) {
            return new Bundle();
        }
        return LLJJIJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.iwu, "context.resources.getStr…notification_group_inbox)");
    }
}
