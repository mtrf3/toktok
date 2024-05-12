package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194667kU implements InterfaceC214228aw {
    public final AtomicReference<C194737kb> LIZ = new AtomicReference<>();
    public final C3KA<C194227jm> LIZIZ = new C3KA<>(new C194227jm(null, null));
    public final C194707kY LIZJ = new C194707kY();
    public final C194727ka LIZLLL = new C194727ka(this);
    public final C194687kW LJ = new C194687kW();
    public final C194677kV LJFF = new C194677kV();

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC88763e4 getOperator() {
        return this.LIZLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        X.C194597kN.LIZ.LIZ.postValue(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (X.C78596Usy.LJJIFFI().LIZJ.LIZ.size() <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (((java.util.HashSet) X.C78596Usy.LJJIFFI().LIZJ.LJ).size() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        X.C194597kN.LJI(X.C194647kS.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r5.getHasCreatedToday() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        X.C194597kN.LJI(X.C194657kT.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x000f, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = new java.util.ArrayList<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r3.getClass();
        ((java.util.HashSet) r3.LJ).clear();
        r3.LJ.addAll(r2);
        ((java.util.HashSet) r3.LJFF).clear();
        r3.LJFF.addAll(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r5 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.models.UserPublishInfo r5) {
        /*
            r4 = this;
            X.7kY r3 = r4.LIZJ
            if (r5 == 0) goto La
            java.util.List r2 = r5.getValidAids()
            if (r2 != 0) goto L11
        La:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r5 == 0) goto L17
        L11:
            java.util.List r1 = r5.getTodayAids()
            if (r1 != 0) goto L1c
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L1c:
            r3.getClass()
            java.util.Set<java.lang.String> r0 = r3.LJ
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            java.util.Set<java.lang.String> r0 = r3.LJ
            r0.addAll(r2)
            java.util.Set<java.lang.String> r0 = r3.LJFF
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            java.util.Set<java.lang.String> r0 = r3.LJFF
            r0.addAll(r1)
            if (r5 != 0) goto L3b
        L3a:
            return
        L3b:
            X.7kA r0 = X.C194597kN.LIZ
            androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.models.UserPublishInfo> r0 = r0.LIZ
            r0.postValue(r5)
            X.7kU r0 = X.C78596Usy.LJJIFFI()
            X.7kY r0 = r0.LIZJ
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LIZ
            int r0 = r0.size()
            if (r0 <= 0) goto L51
            goto L3a
        L51:
            X.7kU r0 = X.C78596Usy.LJJIFFI()
            X.7kY r0 = r0.LIZJ
            java.util.Set<java.lang.String> r0 = r0.LJ
            java.util.HashSet r0 = (java.util.HashSet) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L67
        L61:
            X.7kS r0 = X.C194647kS.LIZ
            X.C194597kN.LJI(r0)
            goto L3a
        L67:
            boolean r0 = r5.getHasCreatedToday()
            if (r0 == 0) goto L6e
            goto L61
        L6e:
            X.7kT r0 = X.C194657kT.LIZ
            X.C194597kN.LJI(r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194667kU.LIZ(com.ss.android.ugc.aweme.models.UserPublishInfo):void");
    }
}
