package com.bytedance.android.livesdk.chatroom.widget;

import X.C0K2;
import X.C15380j0;
import X.C47121t6;
import X.C47261Igj;
import X.C76800UCe;
import X.C87277YNd;
import X.InterfaceC65784Pro;
import X.O5Y;
import Y.ARunnableS41S0100000_5;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ScreenRecordStatusWidget extends LiveRecyclableWidget {
    public final Room LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public TextView LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public String LJLLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cv6;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void LJZ() {
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.mtb));
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 != null) {
                C87277YNd.LJJIJ(c47121t62);
                C47121t6 c47121t63 = this.LJLJJL;
                if (c47121t63 != null) {
                    C87277YNd.LJJIIZ(c47121t63);
                    TextView textView = this.LJLJL;
                    if (textView != null) {
                        C87277YNd.LJJIIZ(textView);
                        return;
                    } else {
                        o.LJIJI("startButton");
                        throw null;
                    }
                }
                o.LJIJI("titleTextView");
                throw null;
            }
            o.LJIJI("contentTextView");
            throw null;
        }
        o.LJIJI("contentTextView");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (!this.LJLJLJ && this.LJLJLLL) {
            super.show();
            View view = this.contentView;
            if (view != null) {
                view.post(new ARunnableS41S0100000_5(this, UserLevelGeckoUpdateSetting.DEFAULT));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        String str;
        Resources resources;
        String[] strArr = new String[1];
        View view = getView();
        if (view == null || (resources = view.getResources()) == null || (str = resources.getString(R.string.ntp)) == null) {
            str = "";
        }
        strArr[0] = str;
        C47261Igj.LJII(strArr);
        View findViewById = findViewById(R.id.las);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.title_view)");
        this.LJLJJL = (C47121t6) findViewById;
        View findViewById2 = findViewById(R.id.bul);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.content_view)");
        this.LJLJJLL = (C47121t6) findViewById2;
        View findViewById3 = findViewById(R.id.kcq);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.start_button)");
        this.LJLJL = (TextView) findViewById3;
        this.dataChannel.lv0(this, PauseLiveChannel.class, new AqS171S0100000_5(this, 351));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0040, code lost:
    
        if (r1 != null) goto L16;
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget.onLoad(java.lang.Object[]):void");
    }

    public static void LJLZ(int i, String str) {
        int i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("pack_name", str);
        }
        if (i != 0) {
            linkedHashMap.put("error_type", Integer.valueOf(i));
        }
        String LJJL = O5Y.LJJL("livesdk_screen_record_open_game");
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C0K2.LJII(i2, LJJL, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZI(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.LJLL = r8
            r7.LJLLI = r9
            android.widget.TextView r2 = r7.LJLJL
            r5 = 0
            if (r2 == 0) goto L89
            int r0 = r8.length()
            r4 = 0
            r6 = 1
            if (r0 <= 0) goto L2d
            int r0 = r9.length()
            if (r0 <= 0) goto L2d
            r2.setVisibility(r4)
            r2.setEnabled(r6)
            android.content.Context r0 = X.C15380j0.LIZLLL()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r0, r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L2d:
            r0 = 8
            r2.setVisibility(r0)
            goto L50
        L33:
            r0 = 0
        L34:
            r3 = 2131837324(0x7f11418c, float:1.930784E38)
            if (r0 == 0) goto L51
            android.content.Context r1 = r2.getContext()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r9
            java.lang.String r0 = r1.getString(r3, r0)
            r2.setText(r0)
            X.C9z r0 = new X.C9z
            r0.<init>(r7, r8, r9)
            X.C16880lQ.LJIJI(r2, r0)
        L50:
            return
        L51:
            X.Pro<X.UCe> r0 = r7.LJLJJI
            if (r0 == 0) goto L6d
            android.content.Context r1 = r2.getContext()
            r0 = 2131839512(0x7f114a18, float:1.9312278E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            Y.ACListenerS27S1200000_5 r1 = new Y.ACListenerS27S1200000_5
            r0 = 1
            r1.<init>(r7, r2, r9, r0)
            X.C16880lQ.LJIJI(r2, r1)
            goto L50
        L6d:
            int r0 = r9.length()
            if (r0 <= 0) goto L50
            android.content.Context r1 = r2.getContext()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r9
            java.lang.String r0 = r1.getString(r3, r0)
            r2.setText(r0)
            r2.setEnabled(r4)
            X.C16880lQ.LJIJI(r2, r5)
            goto L50
        L89:
            java.lang.String r0 = "startButton"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget.LJZI(java.lang.String, java.lang.String):void");
    }

    public ScreenRecordStatusWidget(Room room, String anchorId, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(anchorId, "anchorId");
        this.LJLIL = room;
        this.LJLILLLLZI = anchorId;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
        new ArrayList();
        this.LJLJLLL = true;
        this.LJLL = "";
        this.LJLLI = "";
    }
}
