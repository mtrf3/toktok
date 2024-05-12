package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.B83;
import X.BUT;
import X.C119774mz;
import X.C15380j0;
import X.C29052Bai;
import X.C29306Beo;
import X.C29374Bfu;
import X.C47261Igj;
import X.F9J;
import X.O6R;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewApplyWidget extends PreviewWidget {
    public Integer LJLJJI;
    public C119774mz LJLJL;
    public final BUT LJLJI = (BUT) DataChannelGlobal.LJLJJI.mv0(C29052Bai.class);
    public final Map<String, Boolean> LJLJJL = new LinkedHashMap();
    public final List<String> LJLJJLL = C47261Igj.LJJIJIIJI("live", "live_by_record", "computer");

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpr;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LiveMode LL() {
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
            return LiveMode.VIDEO;
        }
        return liveMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLFF() {
        Integer num;
        int i;
        int i2;
        TextView textView;
        Map map;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        Map map2;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        Map map3;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo3;
        float f;
        Integer num2;
        SharedPreferences LIZIZ;
        SharedPreferences.Editor edit;
        TextView textView2;
        List<String> list = this.LJLJJLL;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (true ^ o.LJ(str, LLF())) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.LJLJJL.put(it.next(), Boolean.FALSE);
        }
        if (!LLFFF() || (num2 = this.LJLJJI) == null || num2.intValue() != 0) {
            if (!LLFII() || (num = this.LJLJJI) == null || num.intValue() != 0) {
                hide();
            } else {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (map3 = (Map) dataChannel.kv0(PermissionApplyInfoChannel.class)) != null && (permissionApplyInfo3 = (LivePermissionApplyResponse.PermissionApplyInfo) map3.get(LLF())) != null) {
                    i = permissionApplyInfo3.mNeedLiveTime;
                } else {
                    i = 0;
                }
                DataChannel dataChannel2 = this.dataChannel;
                if ((dataChannel2 == null || (map2 = (Map) dataChannel2.kv0(PermissionApplyInfoChannel.class)) == null || (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map2.get(LLF())) == null || permissionApplyInfo2.mApplySource == 0) && i > 0) {
                    float LJJIIZ = O6R.LJJIIZ(((float) (i / 3600.0d)) * r1) / 10;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    DataChannel dataChannel3 = this.dataChannel;
                    if (dataChannel3 != null && (map = (Map) dataChannel3.kv0(PermissionApplyInfoChannel.class)) != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(LLF())) != null) {
                        i2 = permissionApplyInfo.mApplyInvalidTime;
                    } else {
                        i2 = 0;
                    }
                    View view = getView();
                    if ((view instanceof TextView) && (textView = (TextView) view) != null) {
                        textView.setText(C15380j0.LJIIIIZZ(R.plurals.mz, i, String.valueOf(LJJIIZ), simpleDateFormat.format(Long.valueOf(i2 * 1000))));
                    }
                    show();
                }
            }
        } else {
            View view2 = getView();
            if ((view2 instanceof TextView) && (textView2 = (TextView) view2) != null) {
                textView2.setText(C15380j0.LJIILJJIL(R.string.mee));
            }
            Context context = this.context;
            String mode = LL().name();
            String uid = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            o.LJIIIZ(mode, "mode");
            o.LJIIIZ(uid, "uid");
            if (context != null && (LIZIZ = F9J.LIZIZ(context, 0, "Congrats")) != null && (edit = LIZIZ.edit()) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(uid);
                LIZ.append(mode);
                LIZ.append("ever_show_congrats");
                edit.putBoolean(X1D.LIZIZ(LIZ), true);
                edit.apply();
            }
            this.LJLJJL.put(LLF(), Boolean.TRUE);
            show();
        }
        C119774mz c119774mz = this.LJLJL;
        if (c119774mz != null) {
            if (isShowing()) {
                f = 24.0f;
            } else {
                f = 16.0f;
            }
            C29306Beo.LJJJJJL(C15380j0.LIZ(f), c119774mz);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLFFF() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r5 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            return r5
        L14:
            java.lang.String r3 = r6.LLF()
            int r1 = r3.hashCode()
            r0 = -599163109(0xffffffffdc497f1b, float:-2.268649E17)
            r2 = 0
            if (r1 == r0) goto L92
            r0 = 3322092(0x32b0ec, float:4.655242E-39)
            if (r1 == r0) goto L7f
            r0 = 1409520038(0x540391a6, float:2.2603372E12)
            if (r1 == r0) goto L6b
        L2c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L2e:
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r6.LJLJJL
            java.lang.String r0 = r6.LLF()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L69
            boolean r3 = r0.booleanValue()
        L42:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cur mode isShowing "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " cur mode's live permission "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "PreviewApplyWidget"
            X.C0NB.LIZIZ(r0, r1)
            r1 = 1
            if (r3 == 0) goto La6
            boolean r0 = X.C29306Beo.LJIILLIIL(r2)
            if (r0 == 0) goto La6
            return r1
        L69:
            r3 = 0
            goto L42
        L6b:
            java.lang.String r0 = "live_by_record"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L74
            goto L2c
        L74:
            X.BUT r0 = r6.LJLJI
            if (r0 == 0) goto L2e
            boolean r0 = r0.LJLILLLLZI
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L2e
        L7f:
            java.lang.String r0 = "live"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2c
            X.BUT r0 = r6.LJLJI
            if (r0 == 0) goto L2e
            boolean r0 = r0.LJLIL
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L2e
        L92:
            java.lang.String r0 = "computer"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L9b
            goto L2c
        L9b:
            X.BUT r0 = r6.LJLJI
            if (r0 == 0) goto L2e
            boolean r0 = r0.LJLJI
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L2e
        La6:
            java.lang.String r4 = X.C0DC.LIZ()
            boolean r0 = X.C29306Beo.LJIILLIIL(r2)
            if (r0 == 0) goto Le9
            android.content.Context r1 = r6.context
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r6.LL()
            java.lang.String r3 = r0.name()
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "Congrats"
            android.content.SharedPreferences r2 = X.F9J.LIZIZ(r1, r5, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = "ever_show_congrats"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            boolean r0 = r2.getBoolean(r0, r5)
            if (r0 != 0) goto Le9
            r5 = 1
        Le9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget.LLFFF():boolean");
    }

    public final boolean LLFII() {
        boolean z;
        boolean z2;
        Map map;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (map = (Map) dataChannel.kv0(PermissionApplyInfoChannel.class)) != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(LLF())) != null && permissionApplyInfo.mApplyStatus == 1) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = (Boolean) this.dataChannel.kv0(LiveAccessTipsShowChannel.class);
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        if (z && !z2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Integer num = this.LJLJJI;
        if (num == null || num.intValue() != 0) {
            return;
        }
        if (!LLFFF() && !LLFII()) {
            return;
        }
        super.show();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        float f;
        super.LJZ();
        LLFF();
        C119774mz c119774mz = this.LJLJL;
        if (c119774mz != null) {
            if (isShowing()) {
                f = 24.0f;
            } else {
                f = 16.0f;
            }
            C29306Beo.LJJJJJL(C15380j0.LIZ(f), c119774mz);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, PermissionApplyInfoChannel.class, new AqS171S0100000_5(this, 167));
            dataChannel.ov0(this, LiveAccessTipsShowChannel.class, new AqS171S0100000_5(this, 168));
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 169));
        }
    }

    public final String LLF() {
        String modeFromServer = LL().getModeFromServer();
        o.LJIIIIZZ(modeFromServer, "liveMode.modeFromServer");
        return modeFromServer;
    }
}
