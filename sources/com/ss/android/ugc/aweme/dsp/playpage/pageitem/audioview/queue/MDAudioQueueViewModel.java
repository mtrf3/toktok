package com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue;

import X.A2F;
import X.A2G;
import X.C221108m2;
import X.C33Q;
import X.C36636EZk;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C62822Ol8;
import X.C8HZ;
import X.C91352ZtE;
import X.C91379Ztf;
import X.C91609ZxN;
import X.C91610ZxO;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.InterfaceC91296ZsK;
import X.XKX;
import X.YBM;
import android.content.Context;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MDAudioQueueViewModel extends AssemListViewModel<C91609ZxN, InterfaceC57784Mm4, Long> {
    public boolean LJLIL;
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LIZLLL(this, C91379Ztf.class, "play_page"), true);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 24));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C91609ZxN(0);
    }

    public final C91379Ztf gv0() {
        return (C91379Ztf) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        gv0().LJLIL.getPlayerController().bK((C91352ZtE) this.LJLJI.getValue());
        gv0().LJLIL.getPlayerController().LJLILLLLZI.LJLJI.LJLIL.LJIIL((C91352ZtE) this.LJLJI.getValue());
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        gv0().LJLIL.getPlayerController().Mu((C91352ZtE) this.LJLJI.getValue());
        gv0().LJLIL.getPlayerController().LJLILLLLZI.LJLJI.LJLIL.LJII((C91352ZtE) this.LJLJI.getValue());
    }

    public static boolean hv0(InterfaceC91296ZsK interfaceC91296ZsK) {
        if (interfaceC91296ZsK == null || !interfaceC91296ZsK.LJIILIIL()) {
            return false;
        }
        YBM.LIZ.getClass();
        if (!YBM.LIZIZ() && ExpiredPlayableManager.INSTANCE.isPlayableExpiredToday(interfaceC91296ZsK.getId())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new IDqS417S0100000_29(newListState, (C8HZ<InterfaceC57784Mm4>) 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        r15 = new com.ss.android.ugc.aweme.base.model.UrlModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (r9 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        r16 = r9.getSongName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if (r16 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r3 = r9.getArtistName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r3 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r1.add(new X.C91496ZvY(r13, r14, r15, r16, r17, r18, r19, new kotlin.jvm.internal.IDqS440S0100000_29(r21, 1)));
        r6 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if (r6.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        r5 = r6.next();
        r4 = r5.getDuration() / 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r4 <= 3600) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        r1.add(new X.C91496ZvY(r5.getId(), r5.LIZIZ(), r5.LJIIZILJ(), r5.getSongName(), r5.getArtistName(), X.C56451MDn.LIZ(r4, r3), X.EnumC91310ZsY.PLAYBACK_STATE_STOPPED, new kotlin.jvm.internal.IDqS440S0100000_29(r21, 2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        return X.A2F.LIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r16 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        r15 = r9.LJIIZILJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (r15 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (r9 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
    
        if (r14 == null) goto L13;
     */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r22) {
        /*
            r21 = this;
            X.A2F r11 = X.A2G.LIZ
            r2 = r21
            X.Ztf r0 = r2.gv0()
            X.Zs5 r0 = r0.LJLIL
            X.Zx4 r1 = r0.getPlayerController()
            r0 = 0
            java.util.List r10 = r1.LJIIIZ(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.Ztf r0 = r2.gv0()
            X.Zs5 r0 = r0.LJLIL
            X.Zx4 r0 = r0.getPlayerController()
            X.ZsK r9 = r0.LIZ()
            X.Ztf r0 = r2.gv0()
            X.Zs5 r0 = r0.LJLIL
            X.Zx4 r0 = r0.getPlayerController()
            X.ZsY r19 = r0.LJIJI()
            X.Ztf r0 = r2.gv0()
            X.Zs5 r0 = r0.LJLIL
            X.Zx4 r0 = r0.getPlayerController()
            X.ZxJ r0 = r0.LJLILLLLZI
            long r4 = r0.LJIJJ()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r0
            long r4 = r4 / r6
            int r8 = (int) r4
            r6 = 3600(0xe10, double:1.7786E-320)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto Le3
            r3 = 1
        L50:
            java.lang.String r18 = X.C56451MDn.LIZ(r8, r3)
            X.ZvY r12 = new X.ZvY
            java.lang.String r17 = ""
            if (r9 == 0) goto L60
            java.lang.String r13 = r9.getId()
            if (r13 != 0) goto L64
        L60:
            r13 = r17
            if (r9 == 0) goto L6a
        L64:
            java.lang.String r14 = r9.LIZIZ()
            if (r14 != 0) goto L6e
        L6a:
            r14 = r17
            if (r9 == 0) goto L74
        L6e:
            com.ss.android.ugc.aweme.base.model.UrlModel r15 = r9.LJIIZILJ()
            if (r15 != 0) goto L7b
        L74:
            com.ss.android.ugc.aweme.base.model.UrlModel r15 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r15.<init>()
            if (r9 == 0) goto L81
        L7b:
            java.lang.String r16 = r9.getSongName()
            if (r16 != 0) goto L85
        L81:
            r16 = r17
            if (r9 == 0) goto L8b
        L85:
            java.lang.String r3 = r9.getArtistName()
            if (r3 != 0) goto Le0
        L8b:
            kotlin.jvm.internal.IDqS440S0100000_29 r4 = new kotlin.jvm.internal.IDqS440S0100000_29
            r3 = 1
            r4.<init>(r2, r3)
            r20 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.add(r12)
            java.util.Iterator r6 = r10.iterator()
        L9d:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto Le6
            java.lang.Object r5 = r6.next()
            X.ZsK r5 = (X.InterfaceC91296ZsK) r5
            int r4 = r5.getDuration()
            int r4 = r4 / r0
            r3 = 3600(0xe10, float:5.045E-42)
            if (r4 <= r3) goto Lde
            r3 = 1
        Lb3:
            java.lang.String r18 = X.C56451MDn.LIZ(r4, r3)
            X.ZvY r12 = new X.ZvY
            java.lang.String r13 = r5.getId()
            java.lang.String r14 = r5.LIZIZ()
            com.ss.android.ugc.aweme.base.model.UrlModel r15 = r5.LJIIZILJ()
            java.lang.String r16 = r5.getSongName()
            java.lang.String r17 = r5.getArtistName()
            X.ZsY r19 = X.EnumC91310ZsY.PLAYBACK_STATE_STOPPED
            kotlin.jvm.internal.IDqS440S0100000_29 r4 = new kotlin.jvm.internal.IDqS440S0100000_29
            r3 = 2
            r4.<init>(r2, r3)
            r20 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.add(r12)
            goto L9d
        Lde:
            r3 = 0
            goto Lb3
        Le0:
            r17 = r3
            goto L8b
        Le3:
            r3 = 0
            goto L50
        Le6:
            r11.getClass()
            X.A2H r0 = X.A2F.LIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }

    public final void iv0(Context context, String str, String str2) {
        if (this.LJLIL) {
            return;
        }
        XKX.LIZLLL(getAssemVMScope(), C36636EZk.LIZ, null, new C91610ZxO(this, str, str2, context, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(android.content.Context r21, java.lang.String r22, java.lang.String r23, X.InterfaceC67352kd r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel.jv0(android.content.Context, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
