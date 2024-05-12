package X;

import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtE, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91352ZtE implements InterfaceC91291ZsF, InterfaceC91289ZsD {
    public final /* synthetic */ MDAudioQueueViewModel LJLIL;

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public C91352ZtE(MDAudioQueueViewModel mDAudioQueueViewModel) {
        this.LJLIL = mDAudioQueueViewModel;
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLIL.manualListRefresh();
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r7 = new com.ss.android.ugc.aweme.base.model.UrlModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r0 = r4.getArtistName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r10 = r3.LJLJJLL;
        r6 = r3.LJLILLLLZI;
        r12 = r3.LJLJLJ;
        kotlin.jvm.internal.o.LJIIIZ(r6, "fullClipId");
        kotlin.jvm.internal.o.LJIIIZ(r10, "duration");
        r1.listSetItemAt(0, (int) new X.C91496ZvY(r5, r6, r7, r8, r9, r10, r14, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r8 = r4.getSongName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r4 != null) goto L17;
     */
    @Override // X.InterfaceC91289ZsD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlaybackStateChanged(X.EnumC91310ZsY r14) {
        /*
            r13 = this;
            java.lang.String r0 = "currentState"
            r11 = r14
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r0 = r13.LJLIL
            java.util.List r0 = r0.listGetAll()
            r2 = 0
            if (r0 == 0) goto L16
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L17
        L16:
            return
        L17:
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r0 = r13.LJLIL
            X.Ztf r0 = r0.gv0()
            X.Zs5 r0 = r0.LJLIL
            X.Zx4 r0 = r0.getPlayerController()
            X.ZsK r4 = r0.LIZ()
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r0 = r13.LJLIL
            X.Mm4 r3 = r0.listGetAt(r2)
            boolean r0 = r3 instanceof X.C91496ZvY
            if (r0 == 0) goto L78
            X.ZvY r3 = (X.C91496ZvY) r3
            if (r3 == 0) goto L78
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r1 = r13.LJLIL
            java.lang.String r9 = ""
            if (r4 == 0) goto L41
            java.lang.String r5 = r4.getId()
            if (r5 != 0) goto L44
        L41:
            r5 = r9
            if (r4 == 0) goto L4a
        L44:
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r4.LJIIZILJ()
            if (r7 != 0) goto L51
        L4a:
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r7.<init>()
            if (r4 == 0) goto L57
        L51:
            java.lang.String r8 = r4.getSongName()
            if (r8 != 0) goto L5a
        L57:
            r8 = r9
            if (r4 == 0) goto L60
        L5a:
            java.lang.String r0 = r4.getArtistName()
            if (r0 != 0) goto L79
        L60:
            java.lang.String r10 = r3.LJLJJLL
            java.lang.String r6 = r3.LJLILLLLZI
            X.Ynt<java.lang.String, java.lang.String, android.content.Context, X.UCe> r12 = r3.LJLJLJ
            java.lang.String r0 = "fullClipId"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "duration"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.ZvY r4 = new X.ZvY
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.listSetItemAt(r2, r4)
        L78:
            return
        L79:
            r9 = r0
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91352ZtE.onPlaybackStateChanged(X.ZsY):void");
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            this.LJLIL.setState(C91544ZwK.LJLIL);
        } else {
            this.LJLIL.manualListRefresh();
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
