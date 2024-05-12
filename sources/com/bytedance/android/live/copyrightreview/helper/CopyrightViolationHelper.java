package com.bytedance.android.live.copyrightreview.helper;

import X.AnonymousClass172;
import X.B83;
import X.C15380j0;
import X.C16880lQ;
import X.C29374Bfu;
import X.C29827BnD;
import X.C30868C9o;
import X.C39431gh;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73969T1h;
import X.C77437UaH;
import X.CXJ;
import X.DialogC77438UaI;
import X.Q7L;
import X.T16;
import Y.IDCallbackS366S0100000;
import Y.IDRunnableS6S0101000;
import Y.IDfS292S0100000;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public class CopyrightViolationHelper implements GenericLifecycleObserver {
    public final Handler LJLIL;
    public DialogC77438UaI LJLILLLLZI;
    public DialogC77438UaI LJLJI;
    public C73411SrX LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final Runnable LJLJL;
    public final IDRunnableS6S0101000 LJLJLJ = new IDRunnableS6S0101000(0, this, 39);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        DialogC77438UaI dialogC77438UaI = this.LJLILLLLZI;
        if (dialogC77438UaI != null && dialogC77438UaI.isShowing()) {
            this.LJLILLLLZI.dismiss();
        }
        DialogC77438UaI dialogC77438UaI2 = this.LJLJI;
        if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing()) {
            this.LJLJI.dismiss();
        }
        this.LJLIL.removeMessages(1);
        this.LJLIL.removeMessages(2);
    }

    public static boolean LIZIZ(Room room) {
        if (room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public final void LJ(int i) {
        if (!this.LJLIL.hasMessages(i)) {
            this.LJLIL.sendEmptyMessageDelayed(i, 2000L);
        }
        C30868C9o.LIZJ(R.string.mg7);
    }

    public CopyrightViolationHelper(LifecycleOwner lifecycleOwner, Runnable runnable) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJL = runnable;
        this.LJLIL = new Handler(new IDCallbackS366S0100000(this, 1));
    }

    public static void LIZJ(Room room, boolean z, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(room.author().getId()));
        hashMap.put("room_id", String.valueOf(room.getId()));
        if (z) {
            hashMap.put("button_click_type", str);
            if (LIZIZ(room)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            hashMap.put("object_oriented", str2);
            AnonymousClass172.LIZ("livesdk_copyright_notification_popup_click", hashMap);
            return;
        }
        hashMap.put("button_type", str);
        AnonymousClass172.LIZ("livesdk_copyright_warning_popup_click", hashMap);
    }

    public final C73411SrX LIZLLL(Room room, int i, int i2) {
        return (C73411SrX) ((ReviewApi) Q7L.LIZIZ(ReviewApi.class)).confirmCopyright(room.getId(), i, i2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 52), new C39431gh(0, this));
    }

    public final void LIZ(Context context, RemindMessage remindMessage, final Room room, final C73318Sq2 c73318Sq2) {
        boolean z;
        String str;
        DialogC77438UaI dialogC77438UaI;
        final int i = 1;
        if (remindMessage.noticeType == 7) {
            z = true;
        } else {
            z = false;
            DialogC77438UaI dialogC77438UaI2 = this.LJLILLLLZI;
            if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing()) {
                return;
            }
        }
        if (this.LJLJJL || this.LJLIL.hasMessages(1)) {
            return;
        }
        if ((z && (dialogC77438UaI = this.LJLJI) != null && dialogC77438UaI.isShowing()) || this.LJLJJLL || this.LJLIL.hasMessages(2)) {
            return;
        }
        CharSequence LJFF = CXJ.LJFF(remindMessage.noticeContent, "");
        if (TextUtils.isEmpty(LJFF)) {
            LJFF = remindMessage.content;
        }
        if (TextUtils.isEmpty(LJFF)) {
            return;
        }
        CharSequence LJFF2 = CXJ.LJFF(remindMessage.noticeTitle, "");
        if (TextUtils.isEmpty(LJFF2)) {
            LJFF2 = CXJ.LJFF(remindMessage.title, "");
        }
        if (TextUtils.isEmpty(LJFF2)) {
            LJFF2 = C15380j0.LJIILJJIL(R.string.sre);
        }
        if (z) {
            if (!LIZIZ(room)) {
                i = 2;
            }
            C77437UaH c77437UaH = new C77437UaH(context);
            c77437UaH.LJJII = false;
            c77437UaH.LJ(R.string.t1j, new DialogInterface.OnClickListener() { // from class: X.170
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    CopyrightViolationHelper copyrightViolationHelper = this;
                    C73318Sq2 c73318Sq22 = c73318Sq2;
                    Room room2 = room;
                    int i3 = i;
                    copyrightViolationHelper.LJLJJLL = true;
                    C73411SrX c73411SrX = copyrightViolationHelper.LJLJJI;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                    c73318Sq22.LIZ(copyrightViolationHelper.LIZLLL(room2, i3, 101));
                    dialogInterface.dismiss();
                    CopyrightViolationHelper.LIZJ(room2, true, "confirm");
                }
            }, false);
            c77437UaH.LIZJ(R.string.l0_, new DialogInterface.OnClickListener() { // from class: X.171
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    CopyrightViolationHelper copyrightViolationHelper = this;
                    Room room2 = room;
                    C73318Sq2 c73318Sq22 = c73318Sq2;
                    int i3 = i;
                    C73411SrX c73411SrX = copyrightViolationHelper.LJLJJI;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                    CopyrightViolationHelper.LIZJ(room2, true, "end_live");
                    dialogInterface.dismiss();
                    c73318Sq22.LIZ(copyrightViolationHelper.LIZLLL(room2, i3, 102));
                    if (CopyrightViolationHelper.LIZIZ(room2)) {
                        C29162BcU.LIZIZ(0, null);
                        return;
                    }
                    Runnable runnable = copyrightViolationHelper.LJLJL;
                    if (runnable == null) {
                        return;
                    }
                    runnable.run();
                }
            }, false);
            c77437UaH.LIZJ = LJFF2;
            c77437UaH.LJII = LJFF;
            this.LJLJI = c77437UaH.LIZ();
            DialogC77438UaI dialogC77438UaI3 = this.LJLILLLLZI;
            if (dialogC77438UaI3 != null && dialogC77438UaI3.isShowing()) {
                this.LJLIL.postDelayed(this.LJLJLJ, 2000L);
            } else {
                this.LJLIL.post(this.LJLJLJ);
            }
        } else {
            C77437UaH c77437UaH2 = new C77437UaH(context);
            c77437UaH2.LJJII = false;
            c77437UaH2.LJ(R.string.t1j, new DialogInterface.OnClickListener() { // from class: X.16y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    CopyrightViolationHelper copyrightViolationHelper = CopyrightViolationHelper.this;
                    C73318Sq2 c73318Sq22 = c73318Sq2;
                    Room room2 = room;
                    copyrightViolationHelper.LJLJJL = true;
                    c73318Sq22.LIZ(((ReviewApi) Q7L.LIZIZ(ReviewApi.class)).notifyOfConfirmCopyright(room2.getId()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(copyrightViolationHelper, 54), new C39441gi(0, copyrightViolationHelper)));
                    dialogInterface.dismiss();
                    CopyrightViolationHelper.LIZJ(room2, false, "confirm");
                }
            }, false);
            c77437UaH2.LIZJ(R.string.snx, new DialogInterface.OnClickListener() { // from class: X.16z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    CopyrightViolationHelper copyrightViolationHelper = CopyrightViolationHelper.this;
                    Room room2 = room;
                    copyrightViolationHelper.getClass();
                    dialogInterface.dismiss();
                    CopyrightViolationHelper.LIZJ(room2, false, "cancel");
                }
            }, false);
            c77437UaH2.LIZJ = LJFF2;
            c77437UaH2.LJII = LJFF;
            DialogC77438UaI LIZ = c77437UaH2.LIZ();
            this.LJLILLLLZI = LIZ;
            C16880lQ.LIZ(LIZ);
        }
        LIZIZ(room);
        C29827BnD.LIZJ(remindMessage);
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(room.author().getId()));
        hashMap.put("room_id", String.valueOf(room.getId()));
        if (z) {
            if (LIZIZ(room)) {
                str = "anchor";
            } else {
                str = "user";
            }
            hashMap.put("object_oriented", str);
            AnonymousClass172.LIZ("livesdk_copyright_notification_popup_show", hashMap);
            return;
        }
        AnonymousClass172.LIZ("livesdk_copyright_warning_popup_show", hashMap);
    }
}
