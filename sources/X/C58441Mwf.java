package X;

/* renamed from: X.Mwf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58441Mwf extends AbstractC65781Prl implements InterfaceC88472Yns<C8VL, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58441Mwf(boolean z, boolean z2, boolean z3) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        if (r0 != false) goto L8;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.C8VL r6) {
        /*
            r5 = this;
            X.8VL r6 = (X.C8VL) r6
            java.lang.String r0 = "$this$null"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Class<com.ss.android.ugc.aweme.detail.prefab.HeaderBtnsAssem> r0 = com.ss.android.ugc.aweme.detail.prefab.HeaderBtnsAssem.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            r6.LIZ = r0
            X.Kms r0 = X.C52738Kms.LIZ
            r0.getClass()
            X.Ol8 r0 = X.C52738Kms.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto Lc8
            boolean r4 = r5.LJLIL
            boolean r2 = r5.LJLILLLLZI
            X.Mwe r3 = new X.Mwe
            kotlin.jvm.internal.AqS25S0010000_10 r1 = new kotlin.jvm.internal.AqS25S0010000_10
            r0 = 0
            r1.<init>(r2, r0)
            r3.<init>(r1)
            java.util.Map<java.lang.String, X.Mwd> r2 = X.C120944os.LIZ
            java.lang.String r0 = "mdp_music_button_add_song_to_dsp"
            r2.put(r0, r3)
            com.ss.android.ugc.aweme.music.v2.assem.button.MusicPlayFullSongButtonPriority r1 = new com.ss.android.ugc.aweme.music.v2.assem.button.MusicPlayFullSongButtonPriority
            X.DK9 r0 = new X.DK9
            r0.<init>(r4)
            r1.<init>(r0)
            java.lang.String r0 = r1.tag()
            r2.put(r0, r1)
            X.Mwi r0 = X.C58444Mwi.LIZ
            r0.getClass()
            java.util.Set<java.lang.String> r4 = X.C58444Mwi.LIZJ
            if (r4 == 0) goto L59
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L98
        L59:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            X.Ol8 r0 = X.C58444Mwi.LJ
            java.lang.Object r1 = r0.getValue()
            com.google.gson.g r1 = (com.google.gson.g) r1
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r3 = r1.iterator()
        L6f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r2 = r3.next()
            com.google.gson.j r2 = (com.google.gson.j) r2
            X.Mwi r0 = X.C58444Mwi.LIZ     // Catch: java.lang.Exception -> L6f
            r0.getClass()     // Catch: java.lang.Exception -> L6f
            X.5H3 r0 = X.C58444Mwi.LIZLLL     // Catch: java.lang.Exception -> L6f
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L6f
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1     // Catch: java.lang.Exception -> L6f
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = r1.LIZJ(r2, r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L6f
            r4.add(r0)     // Catch: java.lang.Exception -> L6f
            goto L6f
        L96:
            X.C58444Mwi.LIZJ = r4
        L98:
            java.util.Iterator r2 = r4.iterator()
        L9c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r1 = r2.next()
            java.util.Map<java.lang.String, X.Mwd> r0 = X.C120944os.LIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r3 = r0.get(r1)
            X.Mwd r3 = (X.InterfaceC58439Mwd) r3
            if (r3 != 0) goto Lb3
            goto L9c
        Lb3:
            boolean r0 = r3.trigger()
            if (r0 == 0) goto L9c
            java.lang.String r2 = r3.tag()
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 208(0xd0, float:2.91E-43)
            r1.<init>(r3, r0)
            r6.LJI(r2, r1)
            goto Ld3
        Lc8:
            boolean r0 = r5.LJLILLLLZI
            if (r0 == 0) goto Le1
            java.lang.String r1 = "add_song_to_dsp"
            X.Mwh r0 = X.C58443Mwh.LJLIL
            r6.LJI(r1, r0)
        Ld3:
            boolean r0 = r5.LJLJI
            if (r0 == 0) goto Lde
            java.lang.String r1 = "favorite"
            X.7PA r0 = X.C7PA.LJLIL
            r6.LJI(r1, r0)
        Lde:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Le1:
            boolean r0 = r5.LJLIL
            if (r0 == 0) goto Ld3
            java.lang.String r1 = "play_full_song"
            X.Mwg r0 = X.C58442Mwg.LJLIL
            r6.LJI(r1, r0)
            goto Ld3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58441Mwf.invoke(java.lang.Object):java.lang.Object");
    }
}
