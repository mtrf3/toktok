package com.ss.android.ugc.gamora.recorder.voicechange.sticker;

import X.ActivityC45651qj;
import X.C1B8;
import X.C221018lt;
import X.C221108m2;
import X.C29S;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C82622Wbi;
import X.C82632Wbs;
import X.ERS;
import X.ESP;
import X.I3X;
import X.ID0;
import X.InterfaceC135635Tz;
import X.InterfaceC74236TBo;
import X.InterfaceC81397Vx3;
import X.T4Q;
import X.TBT;
import X.UCI;
import X.V16;
import X.WLB;
import X.X1D;
import Y.ARunnableS50S0100000_14;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class SVCStickerHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    static {
        TBT tbt = new TBT(SVCStickerHandler.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(SVCStickerHandler.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(SVCStickerHandler.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp)};
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJJLL = null;
        if (this.LJLJJI) {
            ToolSafeHandler toolSafeHandler = (ToolSafeHandler) this.LJLLI.getValue();
            ARunnableS50S0100000_14 aRunnableS50S0100000_14 = new ARunnableS50S0100000_14(this, 126);
            if (!toolSafeHandler.LJLILLLLZI) {
                toolSafeHandler.post(aRunnableS50S0100000_14);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final ShortVideoContext LJIILIIL() {
        return (ShortVideoContext) this.LJLJLJ.LIZ(this, LJLLILLLL[1]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        boolean z;
        o.LJIIIZ(session, "session");
        boolean LJJII = ID0.LJJII(session.LIZ);
        String str = LJIILIIL().shootWay;
        int i = LJIILIIL().shootMode;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shootWay = ");
        LIZ.append(str);
        LIZ.append(", shootMode = ");
        LIZ.append(i);
        C221018lt.LIZ("SVCStickerHandler", X1D.LIZIZ(LIZ));
        boolean z2 = true;
        if (i != 2 && i != 12 && i != 16) {
            if (!V16.LJJIIZI(LJIILIIL()) && !LJIILIIL().LJJIJIIJI()) {
                if (!C1B8.LIZJ()) {
                    C221018lt.LIZ("SVCStickerHandler", "disable by login");
                } else if (CommerceToolsMusicService.LIZIZ(false).U40()) {
                    C221018lt.LIZ("SVCStickerHandler", "disable by user");
                } else {
                    z = true;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("isMicInputSticker = ");
                    LIZ2.append(LJJII);
                    LIZ2.append(" ,hasPassConditionCheck = ");
                    LIZ2.append(z);
                    LIZ2.append(' ');
                    C221018lt.LIZ("SVCStickerHandler", X1D.LIZIZ(LIZ2));
                    if (!LJJII || !z) {
                        z2 = false;
                    }
                    this.LJLJJL = z2;
                    return z2;
                }
            }
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("disable by shoot mode, ");
            LIZ3.append(i);
            C221018lt.LIZ("SVCStickerHandler", X1D.LIZIZ(LIZ3));
        }
        z = false;
        StringBuilder LIZ22 = X1D.LIZ();
        LIZ22.append("isMicInputSticker = ");
        LIZ22.append(LJJII);
        LIZ22.append(" ,hasPassConditionCheck = ");
        LIZ22.append(z);
        LIZ22.append(' ');
        C221018lt.LIZ("SVCStickerHandler", X1D.LIZIZ(LIZ22));
        if (!LJJII) {
        }
        z2 = false;
        this.LJLJJL = z2;
        return z2;
    }

    public SVCStickerHandler(C29S activity, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI = diContainer;
        this.LJLJI = activity;
        this.LJLJL = UCI.LJI(diContainer, WLB.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, I3X.class, null);
        this.LJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 283));
        this.LJLLI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 436));
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        if (o.LJ(this.LJLJJLL, session.LIZ.getEffectId())) {
            return;
        }
        this.LJLJJLL = session.LIZ.getEffectId();
        if (this.LJLJJI) {
            ToolSafeHandler toolSafeHandler = (ToolSafeHandler) this.LJLLI.getValue();
            ARunnableS50S0100000_14 aRunnableS50S0100000_14 = new ARunnableS50S0100000_14(this, 127);
            if (!toolSafeHandler.LJLILLLLZI) {
                toolSafeHandler.post(aRunnableS50S0100000_14);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC81397Vx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(int r5, int r6, int r7, java.lang.String r8) {
        /*
            r4 = this;
            r0 = 399729(0x61971, float:5.6014E-40)
            if (r0 != r5) goto L1e
            boolean r0 = r4.LJLJJL
            java.lang.String r2 = "SVCStickerHandler"
            if (r0 != 0) goto L11
            java.lang.String r0 = "onMessageReceived, disable by canHandle check"
            X.C221018lt.LIZ(r2, r0)
            return
        L11:
            if (r8 == 0) goto L19
            int r0 = r8.length()
            if (r0 != 0) goto L1f
        L19:
            java.lang.String r0 = "onMessageReceived, arg3 is null or empty"
            X.C221018lt.LIZ(r2, r0)
        L1e:
            return
        L1f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L35
            r1.<init>(r8)     // Catch: org.json.JSONException -> L35
            java.lang.String r0 = "voice_change"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L35
            if (r1 == 0) goto L3b
            java.lang.String r0 = "speaker_id"
            java.lang.String r3 = r1.optString(r0)     // Catch: org.json.JSONException -> L35
            if (r3 != 0) goto L3d
            goto L3b
        L35:
            r1 = move-exception
            java.lang.String r0 = "onMessageReceived , arg3 json exception"
            X.C221018lt.LIZJ(r2, r0, r1)
        L3b:
            java.lang.String r3 = ""
        L3d:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "speakerId = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LIZ(r2, r0)
            X.Ol8 r0 = r4.LJLLI
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler r2 = (com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler) r2
            Y.ARunnableS15S1100000_14 r1 = new Y.ARunnableS15S1100000_14
            r0 = 11
            r1.<init>(r4, r3, r0)
            boolean r0 = r2.LJLILLLLZI
            if (r0 != 0) goto L1e
            r2.post(r1)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.voicechange.sticker.SVCStickerHandler.onMessageReceived(int, int, int, java.lang.String):void");
    }
}
