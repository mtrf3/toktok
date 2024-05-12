package com.bytedance.android.livesdk.usercard;

import X.C15380j0;
import X.C28448BEm;
import X.C28465BFd;
import X.C28507BGt;
import X.C29494Bhq;
import X.CN1;
import X.InterfaceC28456BEu;
import X.InterfaceC28458BEw;
import X.InterfaceC28558BIs;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveProfileManageDialog extends LiveDialogFragment implements View.OnClickListener, InterfaceC28456BEu, InterfaceC28458BEw, InterfaceC28558BIs {
    public static final /* synthetic */ int LJLJJL = 0;
    public Room LJLIL;
    public User LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public boolean LJLJI = true;

    @Override // X.InterfaceC28458BEw
    public final void Hh() {
    }

    @Override // X.InterfaceC28558BIs
    public final void U3(Exception exc) {
    }

    @Override // X.InterfaceC28456BEu
    public final void Ze(Exception exc) {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC28458BEw
    public final void k1(C28465BFd c28465BFd, Exception exc) {
    }

    @Override // X.InterfaceC28456BEu
    public final void of(AdminUserBean adminUserBean, Exception exc) {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        boolean z;
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("arg_msg_is_vertical");
        } else {
            z = true;
        }
        this.LJLJI = z;
        if (this.LJLJI) {
            i = R.layout.czw;
        } else {
            i = R.layout.czx;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        c28507BGt.LIZIZ = 0;
        if (this.LJLJI) {
            c28507BGt.LJII = 80;
            c28507BGt.LJIIIZ = -1;
            c28507BGt.LJIIJ = -2;
            c28507BGt.LIZJ = R.style.aas;
        } else {
            c28507BGt.LJII = 5;
            c28507BGt.LJIIIZ = C15380j0.LJFF(R.dimen.adc);
            c28507BGt.LJIIJ = -1;
            c28507BGt.LIZJ = R.style.aau;
        }
        return c28507BGt;
    }

    @Override // X.InterfaceC28558BIs
    public final void ck(boolean z) {
        int i;
        if (z) {
            vl(1);
        }
        if (this.isViewValid) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.guh);
            if (z) {
                i = R.string.svr;
            } else {
                i = R.string.svs;
            }
            textView.setText(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r29 == null) goto L17;
     */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.OSJ, O] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r38) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.LiveProfileManageDialog.onClick(android.view.View):void");
    }

    public final void vl(int i) {
        Serializable serializable;
        String str;
        FragmentManager fragmentManager;
        C28448BEm c28448BEm;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("report_arg");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof C28448BEm) || (c28448BEm = (C28448BEm) serializable) == null || (str = c28448BEm.getMsgContent()) == null) {
            str = "";
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) == null) {
            return;
        }
        IAdminSettingService iAdminSettingService = (IAdminSettingService) CN1.LIZ(IAdminSettingService.class);
        Room room = this.LJLIL;
        if (room != null) {
            iAdminSettingService.jE(room.getId(), str, fragmentManager, i);
        } else {
            o.LJIJI("mRoom");
            throw null;
        }
    }

    @Override // X.InterfaceC28456BEu
    public final void Ti(long j, boolean z) {
        TextView textView;
        int i;
        User user = this.LJLILLLLZI;
        if (user != null) {
            UserAttr userAttr = user.getUserAttr();
            if (userAttr == null) {
                userAttr = new UserAttr();
                User user2 = this.LJLILLLLZI;
                if (user2 != null) {
                    user2.setUserAttr(userAttr);
                } else {
                    o.LJIJI("mUser");
                    throw null;
                }
            }
            userAttr.isAdmin = z;
            if (this.isViewValid && (textView = (TextView) _$_findCachedViewById(R.id.ge3)) != null) {
                if (z) {
                    i = R.string.mlh;
                } else {
                    i = R.string.mle;
                }
                textView.setText(i);
                return;
            }
            return;
        }
        o.LJIJI("mUser");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (r1 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (X.C28427BDr.LIZ(3) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r3 = r6.dataChannel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r3 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        r3.lv0(r6, com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent.class, new kotlin.jvm.internal.AqS171S0100000_5(r6, 493));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        X.C29306Beo.LJJLJLI(_$_findCachedViewById(com.zhiliaoapp.musically.R.id.fef));
        X.C29306Beo.LJJLJLI(_$_findCachedViewById(com.zhiliaoapp.musically.R.id.feg));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        if (X.C28427BDr.LIZ(2) != false) goto L40;
     */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            super.onViewCreated(r7, r8)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto L16
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 != 0) goto L17
        L16:
            return
        L17:
            r6.LJLIL = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto L16
            java.lang.Class<X.BEo> r0 = X.C28450BEo.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 != 0) goto L28
            goto L16
        L28:
            r6.LJLILLLLZI = r0
            r0 = 2131363904(0x7f0a0840, float:1.834763E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            X.1t6 r0 = (X.C47121t6) r0
            if (r0 == 0) goto L38
            X.C16880lQ.LJJIIZ(r0, r6)
        L38:
            r0 = 2131374618(0x7f0a321a, float:1.836936E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            X.1t6 r0 = (X.C47121t6) r0
            X.C16880lQ.LJJIIZ(r0, r6)
            r4 = 2131371791(0x7f0a270f, float:1.8363627E38)
            android.view.View r0 = r6._$_findCachedViewById(r4)
            X.1t6 r0 = (X.C47121t6) r0
            X.C16880lQ.LJJIIZ(r0, r6)
            r2 = 2131369825(0x7f0a1f61, float:1.835964E38)
            android.view.View r0 = r6._$_findCachedViewById(r2)
            X.1t6 r0 = (X.C47121t6) r0
            if (r0 == 0) goto L5e
            X.C16880lQ.LJJIIZ(r0, r6)
        L5e:
            r5 = 2131371183(0x7f0a24af, float:1.8362394E38)
            android.view.View r0 = r6._$_findCachedViewById(r5)
            X.1t6 r0 = (X.C47121t6) r0
            if (r0 == 0) goto L6c
            X.C16880lQ.LJJIIZ(r0, r6)
        L6c:
            com.bytedance.android.live.base.model.user.User r0 = r6.LJLILLLLZI
            if (r0 == 0) goto Lf5
            com.bytedance.android.livesdk.model.UserAttr r3 = r0.getUserAttr()
            if (r3 == 0) goto L98
            android.view.View r1 = r6._$_findCachedViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L88
            boolean r0 = r3.isAdmin
            if (r0 == 0) goto Lf1
            r0 = 2131839612(0x7f114a7c, float:1.931248E38)
        L85:
            r1.setText(r0)
        L88:
            android.view.View r1 = r6._$_findCachedViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            boolean r0 = r3.isMuted
            if (r0 == 0) goto Led
            r0 = 2131847540(0x7f116974, float:1.932856E38)
        L95:
            r1.setText(r0)
        L98:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.dataChannel
            boolean r1 = X.C29306Beo.LJIIJ(r0)
            if (r1 == 0) goto Le5
            android.view.View r0 = r6._$_findCachedViewById(r5)
            if (r0 == 0) goto La9
            X.C29306Beo.LJJLJLI(r0)
        La9:
            android.view.View r0 = r6._$_findCachedViewById(r4)
            X.C29306Beo.LJJLJLI(r0)
            r0 = 2131371797(0x7f0a2715, float:1.8363639E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            X.C29306Beo.LJJLJLI(r0)
            if (r1 != 0) goto Lc3
        Lbc:
            r0 = 3
            boolean r0 = X.C28427BDr.LIZ(r0)
            if (r0 == 0) goto Ld4
        Lc3:
            android.view.View r0 = r6._$_findCachedViewById(r2)
            X.C29306Beo.LJJLJLI(r0)
            r0 = 2131369826(0x7f0a1f62, float:1.8359641E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            X.C29306Beo.LJJLJLI(r0)
        Ld4:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r6.dataChannel
            if (r3 == 0) goto Le4
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent> r2 = com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent.class
            kotlin.jvm.internal.AqS171S0100000_5 r1 = new kotlin.jvm.internal.AqS171S0100000_5
            r0 = 493(0x1ed, float:6.91E-43)
            r1.<init>(r6, r0)
            r3.lv0(r6, r2, r1)
        Le4:
            return
        Le5:
            r0 = 2
            boolean r0 = X.C28427BDr.LIZ(r0)
            if (r0 == 0) goto Lbc
            goto La9
        Led:
            r0 = 2131847541(0x7f116975, float:1.9328562E38)
            goto L95
        Lf1:
            r0 = 2131838935(0x7f1147d7, float:1.9311107E38)
            goto L85
        Lf5:
            java.lang.String r0 = "mUser"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.LiveProfileManageDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
