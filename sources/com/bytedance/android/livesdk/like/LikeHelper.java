package com.bytedance.android.livesdk.like;

import X.ActivityC45651qj;
import X.B5G;
import X.B83;
import X.BJB;
import X.BJM;
import X.BM1;
import X.BTJ;
import X.BZI;
import X.C05200Ii;
import X.C0K2;
import X.C12;
import X.C15380j0;
import X.C28594BKc;
import X.C28660BMq;
import X.C28787BRn;
import X.C28835BTj;
import X.C28837BTl;
import X.C29038BaU;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29841BnR;
import X.C29927Bop;
import X.C29982Bpi;
import X.C29987Bpn;
import X.C2QZ;
import X.C38354F3m;
import X.C64504PTg;
import X.C73933Szx;
import X.C74838TYs;
import X.CN1;
import X.EnumC30738C4o;
import X.InterfaceC29856Bng;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.InterfaceC29989Bpp;
import X.InterfaceC29990Bpq;
import X.InterfaceC92693kP;
import X.Q7L;
import X.X1D;
import Y.AfS0S0101100_5;
import Y.AfS36S0101000_5;
import Y.IDTListenerS115S0100000_5;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostHasAutoMatchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class LikeHelper implements GenericLifecycleObserver, InterfaceC29980Bpg {
    public LifecycleOwner LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public Room LJLJI;
    public final IDTListenerS115S0100000_5 LJLJJI;
    public final List<InterfaceC29986Bpm> LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final long LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final long LJLLI;
    public final boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public final String LJLZ;
    public final int LJZ;
    public final int LJZI;
    public boolean LJZL;
    public final boolean LL;
    public final boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public final SparseArray<Bitmap> LLFFF = new SparseArray<>();
    public final List<Bitmap> LLFII = new ArrayList();
    public final BitmapFactory.Options LLFZ;
    public final DataChannel LLI;
    public View LLIFFJFJJ;
    public View LLII;
    public final Map<String, InterfaceC92693kP> LLIIII;
    public int[] LLIIIILZ;
    public final SparseArray<Bitmap> LLIIIJ;
    public final Random LLIIIL;
    public final List<Bitmap> LLIIIZ;
    public final Map<String, Bitmap> LLIIJI;
    public final List<Bitmap> LLIIJLIL;
    public final List<Bitmap> LLIIL;
    public LiveRecyclableWidget LLIILII;
    public LiveRecyclableWidget LLIILZL;
    public List<InterfaceC29990Bpq> LLIIZ;
    public int LLIL;
    public int LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public final List<C2QZ> LLILLIZIL;
    public final Handler LLILLJJLI;

    @Override // X.InterfaceC29980Bpg
    public boolean LJI() {
        return this instanceof OptimizedLikeHelper;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC29980Bpg
    public final void LIZJ() {
        Bitmap bitmap = this.LLFFF.get(R.drawable.ca7);
        if (bitmap != null) {
            this.LLFFF.remove(R.drawable.ca7);
            ((ArrayList) this.LLFII).remove(bitmap);
        }
    }

    @Override // X.InterfaceC29980Bpg
    public final boolean LIZLLL() {
        return !LiveLikeDegradeSettings.INSTANCE.disableLottieAnim(this.LLI);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Bpp, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget] */
    @Override // X.InterfaceC29980Bpg
    public final void LJII() {
        ?? r1 = this.LLIILII;
        if (r1 != 0) {
            r1.LJJJJJL(LJIL(R.drawable.daj));
        }
    }

    @Override // X.InterfaceC29980Bpg
    public final void LJIIJ() {
        Bitmap decodeResource;
        if (this.LLFFF.get(R.drawable.ca7) == null && (decodeResource = BitmapFactory.decodeResource(this.LJLILLLLZI.getResources(), R.drawable.ca7, this.LLFZ)) != null) {
            this.LLFFF.put(R.drawable.ca7, decodeResource);
            ((ArrayList) this.LLFII).add(decodeResource);
        }
    }

    @Override // X.InterfaceC29980Bpg
    public final Bitmap LJIJJ() {
        if (!((ArrayList) this.LLFII).isEmpty()) {
            List<Bitmap> list = this.LLFII;
            Bitmap bitmap = (Bitmap) ListProtector.get(list, this.LLIIIL.nextInt(((ArrayList) list).size()));
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        if (!((ArrayList) this.LLIIJLIL).isEmpty()) {
            List<Bitmap> list2 = this.LLIIJLIL;
            Bitmap bitmap2 = (Bitmap) ListProtector.get(list2, this.LLIIIL.nextInt(((ArrayList) list2).size()));
            if (bitmap2 != null) {
                return bitmap2;
            }
        }
        return LJJIFFI();
    }

    public final boolean LJIJJLI() {
        boolean z;
        if (this.LLI.kv0(UserIsAnchorChannel.class) == null || !((Boolean) this.LLI.kv0(UserIsAnchorChannel.class)).booleanValue() || DiggParamsSetting.INSTANCE.getValue().likeStyle == 1) {
            z = true;
        } else {
            z = false;
        }
        Room room = this.LJLJI;
        if ((room != null && room.getRoomAuthStatus() != null && !this.LJLJI.getRoomAuthStatus().isEnableDigg()) || !z || !B83.LIZ().LIZIZ().isLogin()) {
            return false;
        }
        return true;
    }

    public final boolean LJJ() {
        return LiveLikeDegradeSettings.INSTANCE.disableEasterEggs(this.LLI);
    }

    public final boolean LJJI() {
        if (this.LLI.kv0(LiveCenterStatusChannel.class) != EnumC30738C4o.DISMISS) {
            return false;
        }
        if ((C29306Beo.LJIIJ(this.LLI) && ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nU(this.LLI)) || !this.LLF || this.LJZL) {
            return false;
        }
        return true;
    }

    public final Bitmap LJJIFFI() {
        Bitmap LJIL;
        if (!((ArrayList) this.LLIIIZ).isEmpty()) {
            List<Bitmap> list = this.LLIIIZ;
            LJIL = (Bitmap) ListProtector.get(list, this.LLIIIL.nextInt(((ArrayList) list).size()));
        } else if (this.LJLLILLLL) {
            LJIL = LJIL(R.drawable.d3d);
        } else {
            int[] iArr = this.LLIIIILZ;
            if (iArr == null || iArr.length <= 0) {
                return null;
            }
            LJIL = LJIL(iArr[this.LLIIIL.nextInt(iArr.length)]);
        }
        if (LJIL == null || LJIL.isRecycled()) {
            return null;
        }
        return LJIL;
    }

    public final int LJJIIJ() {
        int i = this.LLIL;
        if (i > 0) {
            return i;
        }
        int LJFF = C15380j0.LJFF(R.dimen.a_e);
        this.LLIL = LJFF;
        return LJFF;
    }

    public final void LJJIJIIJI() {
        IBarrageService iBarrageService = (IBarrageService) CN1.LIZ(IBarrageService.class);
        C28660BMq wm0 = iBarrageService.wm0(this.LJLJI.getId());
        if (wm0.LIZ != 0) {
            return;
        }
        if (Boolean.TRUE.equals(this.LLI.kv0(FirstFrameChannelEvent.class))) {
            wm0.LIZ = 1;
        } else {
            wm0.LIZ = -1;
        }
        Iterator<InterfaceC29986Bpm> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof InterfaceC29989Bpp) {
                wm0.LIZIZ = true;
            }
        }
        iBarrageService.hk0(this.LJLJI.getId(), wm0);
    }

    @Override // X.InterfaceC29980Bpg
    public final void clear() {
        ((ArrayList) this.LLILLIZIL).clear();
        this.LJLIL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Long l;
        Long l2;
        String str;
        LiveMode streamType;
        this.LLILLJJLI.removeMessages(1);
        ((ArrayList) this.LJLJJL).clear();
        this.LLFFF.clear();
        Iterator it = ((ArrayList) this.LLFII).iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        ((ArrayList) this.LLFII).clear();
        for (int i = 0; i < this.LLIIIJ.size(); i++) {
            Bitmap bitmap2 = this.LLIIIJ.get(i);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
        this.LLIIIJ.clear();
        this.LLIIIILZ = null;
        for (InterfaceC92693kP interfaceC92693kP : ((HashMap) this.LLIIII).values()) {
            if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
                interfaceC92693kP.dispose();
            }
        }
        List<InterfaceC29990Bpq> list = this.LLIIZ;
        if (list != null) {
            list.clear();
            this.LLIIZ = null;
        }
        this.LJLIL.getLifecycle().removeObserver(this);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_like_tap_count")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bottom_right_anim_total_amount", C29982Bpi.LIZ);
                jSONObject.put("bottom_right_anim_display_amount", C29982Bpi.LIZIZ);
                jSONObject.put("watch_live_duration", SystemClock.uptimeMillis() - C29982Bpi.LJIIIIZZ);
                jSONObject.put("widget", C29982Bpi.LIZJ);
                int i2 = C29982Bpi.LIZLLL;
                if (i2 >= 0) {
                    jSONObject.put("default_icon_show_count", i2);
                }
                jSONObject.put("top_left_anim_like_count", C29982Bpi.LJ);
                jSONObject.put("full_progress_anim_like_count", C29982Bpi.LJFF);
                jSONObject.put("like_total_count", C29982Bpi.LJI);
                Room room = C29982Bpi.LJII;
                if (room != null) {
                    l = Long.valueOf(room.getOwnerUserId());
                } else {
                    l = null;
                }
                jSONObject.put("anchor_id", l);
                Room room2 = C29982Bpi.LJII;
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getId());
                } else {
                    l2 = null;
                }
                jSONObject.put("room_id", l2);
                Room room3 = C29982Bpi.LJII;
                if (room3 != null && (streamType = room3.getStreamType()) != null) {
                    str = streamType.logStreamingType;
                } else {
                    str = null;
                }
                jSONObject.put("room_type", str);
            } catch (JSONException unused) {
            }
            C0K2.LIZLLL("ttlive_like_tap_count", new JSONObject(), null, jSONObject);
        }
        HashMap<String, C29987Bpn> hashMap = C29982Bpi.LJIIIZ;
        if (!hashMap.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Map.Entry<String, C29987Bpn> entry : hashMap.entrySet()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(entry.getKey());
                    LIZ.append("_max");
                    jSONObject2.put(X1D.LIZIZ(LIZ), entry.getValue().LIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(entry.getKey());
                    LIZ2.append("_average");
                    jSONObject2.put(X1D.LIZIZ(LIZ2), entry.getValue().LIZIZ / entry.getValue().LIZJ);
                }
            } catch (JSONException unused2) {
            }
            C0K2.LIZLLL("ttlive_on_like_duration", new JSONObject(), null, jSONObject2);
        }
        C29982Bpi.LIZ = 0;
        C29982Bpi.LIZIZ = 0;
        C29982Bpi.LIZLLL = -1;
        C29982Bpi.LJ = 0;
        C29982Bpi.LJFF = 0;
        C29982Bpi.LJI = 0;
        C29982Bpi.LJII = null;
        C29982Bpi.LJIIIIZZ = 0L;
        C29982Bpi.LJIIIZ.clear();
    }

    @Override // X.InterfaceC29980Bpg
    public final boolean LIZIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC29980Bpg
    public final boolean LJIIIZ() {
        return this.LLD;
    }

    @Override // X.InterfaceC29980Bpg
    public final int LJIIJJI() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC29980Bpg
    public final boolean LJIILL() {
        return this.LLFF;
    }

    @Override // X.InterfaceC29980Bpg
    public final IDTListenerS115S0100000_5 LJIILLIIL() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC29980Bpg
    public final boolean LJIIZILJ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC29980Bpg
    public final View LJIJI() {
        return this.LLII;
    }

    @Override // X.InterfaceC29980Bpg
    public final boolean isEnabled() {
        return this.LLF;
    }

    @Override // X.InterfaceC29980Bpg
    public final boolean isPaused() {
        return this.LJZL;
    }

    @Override // X.InterfaceC29980Bpg
    public final void LIZ(View view) {
        this.LLII = view;
        this.LJLLLL = 0.0f;
        this.LJLLLLLL = 0.0f;
    }

    @Override // X.InterfaceC29980Bpg
    public final void LJ(InterfaceC29986Bpm interfaceC29986Bpm) {
        if (interfaceC29986Bpm != null && !((ArrayList) this.LJLJJL).contains(interfaceC29986Bpm)) {
            ((ArrayList) this.LJLJJL).add(interfaceC29986Bpm);
        }
    }

    @Override // X.InterfaceC29980Bpg
    public final void LJFF(List<C2QZ> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                ((ArrayList) this.LLILLIZIL).add(next);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Bpo, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget] */
    @Override // X.InterfaceC29980Bpg
    public final void LJIIIIZZ(int i) {
        ?? r1 = this.LLIILZL;
        if (r1 != 0) {
            r1.LJLIIL(i, LJIL(i));
        }
    }

    @Override // X.InterfaceC29980Bpg
    public final void LJIIL(boolean z) {
        this.LJZL = z;
    }

    @Override // X.InterfaceC29980Bpg
    public final void LJIILIIL(C12 c12) {
        if (this.LLIIZ == null) {
            this.LLIIZ = new ArrayList();
        }
        if (c12 != null && !((ArrayList) this.LLIIZ).contains(c12)) {
            ((ArrayList) this.LLIIZ).add(c12);
        }
    }

    @Override // X.InterfaceC29980Bpg
    public final void LJIILJJIL(InterfaceC29986Bpm interfaceC29986Bpm) {
        ((ArrayList) this.LJLJJL).remove(interfaceC29986Bpm);
    }

    @Override // X.InterfaceC29980Bpg
    public final void LJIJ(C12 c12) {
        List<InterfaceC29990Bpq> list = this.LLIIZ;
        if (list != null) {
            ((ArrayList) list).remove(c12);
        }
    }

    public final Bitmap LJIL(int i) {
        Bitmap bitmap = this.LLIIIJ.get(i);
        if (bitmap == null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.LJLILLLLZI.getResources(), i, this.LLFZ);
            this.LLIIIJ.put(i, decodeResource);
            return decodeResource;
        }
        return bitmap;
    }

    public float LJJII(MotionEvent motionEvent) {
        return motionEvent.getRawX();
    }

    public float LJJIII(MotionEvent motionEvent) {
        return motionEvent.getRawY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r5 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap LJJIIJZLJL(java.util.List<com.bytedance.android.live.base.model.ImageModel> r8) {
        /*
            r7 = this;
            r5 = 0
            if (r8 == 0) goto Lb9
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Lb9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r8.iterator()
        L12:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r4 = r6.next()
            com.bytedance.android.live.base.model.ImageModel r4 = (com.bytedance.android.live.base.model.ImageModel) r4
            java.util.Map<java.lang.String, android.graphics.Bitmap> r1 = r7.LLIIJI
            java.lang.String r0 = r4.mUri
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L3c
            java.util.List<android.graphics.Bitmap> r2 = r7.LLIIL
            java.util.Map<java.lang.String, android.graphics.Bitmap> r1 = r7.LLIIJI
            java.lang.String r0 = r4.mUri
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r0)
            goto L12
        L3c:
            X.SrC r2 = X.C31665Cbl.LIZJ(r4)
            Y.IDhS98S0100000_5 r1 = new Y.IDhS98S0100000_5
            r0 = 6
            r1.<init>(r4, r0)
            X.Sxt r0 = r2.LJJIJL(r1)
            r3.add(r0)
            goto L12
        L4e:
            java.util.List<android.graphics.Bitmap> r0 = r7.LLIIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L74
            java.util.List<android.graphics.Bitmap> r2 = r7.LLIIL
            java.util.Random r1 = r7.LLIIIL
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r1.nextInt(r0)
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.util.List<android.graphics.Bitmap> r0 = r7.LLIIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
        L74:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb7
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            X.Svk r1 = X.AbstractC73672Svk.LJJIJLIJ(r3)
            X.JBR r0 = new X.JBR
            r0.<init>()
            X.Sud r1 = r1.LJJIFFI(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r4 = r1.LJJJ(r0)
            Y.AfS36S0101000_5 r3 = new Y.AfS36S0101000_5
            r1 = 3
            r0 = 69
            r3.<init>(r1, r7, r0)
            Y.AfS32S0201000_11 r2 = new Y.AfS32S0201000_11
            r1 = 0
            r0 = 4
            r2.<init>(r1, r7, r6, r0)
            Y.IDaS7S1100000_5 r1 = new Y.IDaS7S1100000_5
            r0 = 1
            r1.<init>(r7, r6, r0)
            X.3kP r1 = r4.LJJJLL(r3, r2, r1)
            java.util.Map<java.lang.String, X.3kP> r0 = r7.LLIIII
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r6, r1)
        Lb7:
            if (r5 != 0) goto Lc5
        Lb9:
            android.graphics.Bitmap r5 = r7.LJJIFFI()
            int r0 = X.C29982Bpi.LIZLLL
            if (r0 < 0) goto Lc5
            int r0 = r0 + 1
            X.C29982Bpi.LIZLLL = r0
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.LJJIIJZLJL(java.util.List):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJJIIZI(int i) {
        int i2;
        C28837BTl LIZIZ = C28835BTj.LIZIZ(null, this.LLI, "user_server_live_like");
        try {
            i2 = LIZIZ.LIZ.equals("1");
        } catch (Exception unused) {
            i2 = 0;
        }
        ((InterfaceC29856Bng) ((LikeApi) Q7L.LIZIZ(LikeApi.class)).like(this.LJLJI.getId(), i, (String) DataChannelGlobal.LJLJJI.mv0(C29038BaU.class), Long.valueOf(this.LJLJI.getOwnerUserId()), LIZIZ.LJIIIZ, LIZIZ.LJ, LIZIZ.LJFF, LIZIZ.LIZLLL, i2, LIZIZ.LJIIIIZZ, LIZIZ.LJIIJ, LIZIZ.LIZJ, "live_ad", LIZIZ.LIZIZ).LJII(BTJ.LIZJ(LikeApi.class)).LIZJ(C73933Szx.LJ(this.LJLIL))).LIZJ(new AfS0S0101100_5(i, this, SystemClock.uptimeMillis(), 3), new AfS36S0101000_5(i, this, 66));
    }

    public void LJJIJ(int i, long j, boolean z) {
        long j2;
        Object obj;
        String str;
        Object obj2;
        HashMap hashMap = new HashMap();
        hashMap.put("live_source", this.LJLZ);
        hashMap.put("request_id", this.LJLJI.getRequestId());
        hashMap.put("log_pb", this.LJLJI.getLog_pb());
        hashMap.put("like_amount", String.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI.getUserFrom());
        LIZ.append("");
        hashMap.put("source", X1D.LIZIZ(LIZ));
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            hashMap.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
        }
        String LJIIIZ = BJM.LJIIIZ();
        boolean isEmpty = TextUtils.isEmpty(LJIIIZ);
        String str2 = "1";
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (!isEmpty && "click_push_live_cd_user".equals(LJIIIZ)) {
            hashMap.put("is_subscribe", "1");
        } else {
            hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (C15380j0.LJIILLIIL()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
            j2 = ((Room) dataChannelGlobal.mv0(C29044Baa.class)).getOwnerUserId();
        } else {
            j2 = 0;
        }
        long j3 = B5G.LIZIZ().LJI;
        String str4 = "anchor";
        if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
            List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
            if (QD.size() > 2) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_multi", obj2);
            if (MultiCohostHasAutoMatchSetting.INSTANCE.getValue() || QD.size() <= 2) {
                ((IInteractService) CN1.LIZ(IInteractService.class)).WA(hashMap);
            }
            if (B5G.LIZIZ().LJIIL) {
                C64504PTg.LIZJ(j2, hashMap, "connection_inviter_id", j3, "connection_invitee_id");
            } else {
                C64504PTg.LIZJ(j2, hashMap, "connection_invitee_id", j3, "connection_inviter_id");
            }
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(B5G.LIZIZ().LJJJJJL));
            if (((IInteractService) CN1.LIZ(IInteractService.class)).GQ()) {
                C64504PTg.LIZJ(j2, hashMap, "pk_inviter_id", j3, "pk_invitee_id");
            } else {
                C64504PTg.LIZJ(j2, hashMap, "pk_invitee_id", j3, "pk_inviter_id");
            }
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                hashMap.put("match_status", "pk_phase");
            } else {
                hashMap.put("match_status", "punish");
            }
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).ta0()) {
            hashMap.put("connection_type", "audience");
        } else if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            hashMap.put("connection_type", "anchor");
        }
        hashMap.put("admin_type", C29841BnR.LIZIZ(this.LJLJI, this.LLI));
        hashMap.put("user_type", ((IInteractService) CN1.LIZ(IInteractService.class)).Ng(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
        if (j != this.LJLJI.getOwnerUserId()) {
            str4 = "guest";
        }
        hashMap.put("to_user_type", str4);
        hashMap.put("to_user_id", String.valueOf(j));
        if (C74838TYs.LJ().LJJ > 0) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_guest_connection", obj);
        if (z) {
            str = "user_profile";
        } else {
            str = "live_room";
        }
        hashMap.put("request_page", str);
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        Map<String, String> L00 = iInteractService.L00();
        if (!TextUtils.isEmpty(iInteractService.FZ())) {
            if (TextUtils.equals("in_pk", iInteractService.FZ())) {
                L00.put("match_status", "pk_phase");
            } else {
                L00.put("match_status", "punish");
            }
        }
        hashMap.putAll(L00);
        hashMap.put("server_heat_level", String.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(this.LJLJI.getId())));
        hashMap.put("client_heat_level", String.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(this.LJLJI.getId())));
        CohostTopic P20 = iInteractService.P20();
        if (P20 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_topic_connection", str2);
        if (P20 != null) {
            str3 = String.valueOf(P20.id);
        }
        hashMap.put("topic_id", str3);
        Map<String, String> map = BM1.LJIIZILJ;
        if (map != null && map.get("tag_name") != null) {
            hashMap.put("live_game_name", BM1.LJIIZILJ.get("tag_name"));
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        hashMap.putAll(BJB.LIZ());
        if (this.LLILL) {
            BZI LIZ2 = C28787BRn.LIZ("like");
            LIZ2.LJJIFFI(hashMap);
            LIZ2.LJIIIZ("live_interact");
            LIZ2.LJIIZILJ();
            LIZ2.LIZLLL(C28835BTj.LIZIZ(null, this.LLI, "user_live_like"));
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJJIIZ();
                LIZ2.LJJIIZI();
            }
        }
        if (C28835BTj.LJFF(this.LLI)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("room_id", String.valueOf(this.LJLJI.getId()));
            hashMap2.put("anchor_id", String.valueOf(this.LJLJI.getOwnerUserId()));
            C28835BTj.LIZ("live_ad", "like", null, hashMap2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        if (r0 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0085, code lost:
    
        if (r0 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LikeHelper(X.ActivityC45651qj r22, androidx.lifecycle.LifecycleOwner r23, final com.bytedance.android.livesdkapi.depend.model.live.Room r24, final boolean r25, final boolean r26, final com.bytedance.ies.sdk.datachannel.DataChannel r27) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.<init>(X.1qj, androidx.lifecycle.LifecycleOwner, com.bytedance.android.livesdkapi.depend.model.live.Room, boolean, boolean, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public void LJJIIZ(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        LJJIJIIJI();
        if (!this.LLILIL) {
            IMessageManager iMessageManager = (IMessageManager) this.LLI.kv0(C29927Bop.class);
            User LIZIZ = C05200Ii.LIZIZ();
            if (iMessageManager != null && LIZIZ != null && !LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(this.LLI)) {
                long id = this.LJLJI.getId();
                CommonMessageData commonMessageData = new CommonMessageData();
                commonMessageData.roomId = id;
                commonMessageData.showMsg = true;
                LikeMessage likeMessage = new LikeMessage(Boolean.TRUE, LIZIZ);
                likeMessage.baseMessage = commonMessageData;
                iMessageManager.insertMessage(likeMessage, true);
                this.LLILIL = true;
            }
        }
    }
}
