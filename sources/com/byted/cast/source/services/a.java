package com.byted.cast.source.services;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class a {
    public b a;
    public C0017a b;
    public Context c;
    public AudioManager d;
    public boolean e = false;

    /* loaded from: classes29.dex */
    public interface b {
        void a(int i);
    }

    public a(Context context) {
        this.c = context;
        this.d = (AudioManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "audio");
    }

    public int a() {
        AudioManager audioManager = this.d;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public int b() {
        AudioManager audioManager = this.d;
        if (audioManager != null) {
            return C16880lQ.LLLLLLZZ(audioManager, 3);
        }
        return 15;
    }

    public b c() {
        return this.a;
    }

    public void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        C0017a c0017a = new C0017a(this, this);
        this.b = c0017a;
        C16880lQ.LJJLIIIJILLIZJL(c0017a, this.c, intentFilter);
        this.e = true;
    }

    public void e() {
        if (this.e) {
            try {
                C16880lQ.LJJLIIIJL(this.c, this.b);
                this.a = null;
                this.e = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.byted.cast.source.services.a$a, reason: collision with other inner class name */
    /* loaded from: classes29.dex */
    public class C0017a extends BroadcastReceiver {
        public WeakReference<a> a;

        public C0017a(a aVar, a aVar2) {
            this.a = new WeakReference<>(aVar2);
        }

        public void com_byted_cast_source_services_a$a__onReceive$___twin___(Context context, Intent intent) {
            WeakReference<a> weakReference;
            a aVar;
            int a;
            if (intent == null || context == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (weakReference = this.a) == null || (aVar = weakReference.get()) == null || aVar.c() == null || (a = aVar.a()) < 0) {
                    return;
                }
                aVar.c().a(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_byted_cast_source_services_a$a_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public static void com_byted_cast_source_services_a$a_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(C0017a c0017a, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                c0017a.com_byted_cast_source_services_a$a__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                c0017a.com_byted_cast_source_services_a$a__onReceive$___twin___(context, intent);
            }
        }

        public static void com_byted_cast_source_services_a$a_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(C0017a c0017a, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_byted_cast_source_services_a$a_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(c0017a, context, intent);
        }
    }
}
