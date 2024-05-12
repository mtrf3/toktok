package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import java.util.HashMap;

/* renamed from: X.0hR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14410hR {
    public final String LIZ = "Favorite";
    public final long LIZIZ = -1;
    public final long LIZJ = 20;
    public final long LIZLLL = 50;
    public final java.util.Map<Long, C33541Ti> LJ = new HashMap();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C516721b.LJLIL);

    public final AccompanimentApi LIZJ() {
        return (AccompanimentApi) this.LJFF.getValue();
    }

    public final C33541Ti LIZLLL(long j) {
        return (C33541Ti) ((HashMap) this.LJ).get(Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super java.lang.Long> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C517021e
            if (r0 == 0) goto L25
            r6 = r12
            X.21e r6 = (X.C517021e) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r9 = 0
            r3 = -1
            r8 = 1
            if (r0 == 0) goto L33
            if (r0 != r8) goto L2b
            long r1 = r6.LJLILLLLZI
            X.0hR r7 = r6.LJLIL
            goto L68
        L25:
            X.21e r6 = new X.21e
            r6.<init>(r11, r12)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C141335gf.LIZJ(r5)
            java.util.Map<java.lang.Long, X.1Ti> r5 = r11.LJ
            long r0 = r11.LIZIZ
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r5.get(r2)
            X.1Ti r0 = (X.C33541Ti) r0
            if (r0 == 0) goto Lbc
            java.util.List<webcast.data.MusicSong> r0 = r0.LJLIL
            if (r0 == 0) goto Lbc
            int r0 = r0.size()
            long r1 = (long) r0
            X.XIA r5 = X.C78613UtF.LIZJ     // Catch: java.lang.Exception -> L6f
            X.2Ek r0 = new X.2Ek     // Catch: java.lang.Exception -> L6f
            r0.<init>(r11, r1, r9)     // Catch: java.lang.Exception -> L6f
            r6.LJLIL = r11     // Catch: java.lang.Exception -> L6f
            r6.LJLILLLLZI = r1     // Catch: java.lang.Exception -> L6f
            r6.LJLJJL = r8     // Catch: java.lang.Exception -> L6f
            java.lang.Object r5 = X.XKX.LJI(r5, r0, r6)     // Catch: java.lang.Exception -> L6f
            if (r5 != r7) goto L66
            return r7
        L66:
            r7 = r11
            goto L6b
        L68:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> L70
        L6b:
            tikcast.api.anchor.FavouritesSongsResponse$ResponseData r5 = (tikcast.api.anchor.FavouritesSongsResponse.ResponseData) r5     // Catch: java.lang.Exception -> L70
            r9 = r5
            goto L70
        L6f:
            r7 = r11
        L70:
            if (r9 != 0) goto L78
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            return r0
        L78:
            java.util.List<webcast.data.MusicSong> r0 = r9.songs
            java.util.Iterator r10 = r0.iterator()
        L7e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r6 = r10.next()
            webcast.data.MusicSong r6 = (webcast.data.MusicSong) r6
            r6.isFavourite = r8
            java.util.Map<java.lang.Long, X.1Ti> r5 = r7.LJ
            long r3 = r7.LIZIZ
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r5.get(r0)
            X.1Ti r0 = (X.C33541Ti) r0
            if (r0 == 0) goto L7e
            java.util.List<webcast.data.MusicSong> r0 = r0.LJLIL
            if (r0 == 0) goto L7e
            r0.add(r6)
            goto L7e
        La7:
            boolean r0 = r9.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto Lb9
        Lb3:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            return r0
        Lb9:
            r1 = 0
            goto Lb3
        Lbc:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14410hR.LJFF(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(1:(2:10|11)(2:49|50))(3:51|52|(1:54)(1:55))|12|(4:15|(4:18|(3:20|21|22)(1:24)|23|16)|25|13)|26|27|(3:31|(3:34|(3:36|37|38)(1:40)|32)|41)|42|(1:46)|47|48))|57|6|7|(0)(0)|12|(1:13)|26|27|(4:29|31|(1:32)|41)|42|(2:44|46)|47|48) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:11:0x004a, B:12:0x004d, B:13:0x0059, B:15:0x005f, B:16:0x007a, B:18:0x0080, B:21:0x008e, B:27:0x0091, B:29:0x00a4, B:31:0x00a8, B:32:0x00ac, B:34:0x00b2, B:37:0x00c0, B:42:0x00c3, B:44:0x00d6, B:46:0x00da, B:52:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:11:0x004a, B:12:0x004d, B:13:0x0059, B:15:0x005f, B:16:0x007a, B:18:0x0080, B:21:0x008e, B:27:0x0091, B:29:0x00a4, B:31:0x00a8, B:32:0x00ac, B:34:0x00b2, B:37:0x00c0, B:42:0x00c3, B:44:0x00d6, B:46:0x00da, B:52:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(webcast.data.MusicSong r11, X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C516621a
            if (r0 == 0) goto L22
            r4 = r12
            X.21a r4 = (X.C516621a) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r1 = r4.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJL
            r8 = 1
            if (r0 == 0) goto L30
            if (r0 != r8) goto L28
            webcast.data.MusicSong r11 = r4.LJLILLLLZI
            X.0hR r6 = r4.LJLIL
            goto L4a
        L22:
            X.21a r4 = new X.21a
            r4.<init>(r10, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            X.XIA r2 = X.C78613UtF.LIZJ     // Catch: java.lang.Exception -> Lde
            X.2Eh r1 = new X.2Eh     // Catch: java.lang.Exception -> Lde
            r0 = 0
            r1.<init>(r10, r11, r0)     // Catch: java.lang.Exception -> Lde
            r4.LJLIL = r10     // Catch: java.lang.Exception -> Lde
            r4.LJLILLLLZI = r11     // Catch: java.lang.Exception -> Lde
            r4.LJLJJL = r8     // Catch: java.lang.Exception -> Lde
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r4)     // Catch: java.lang.Exception -> Lde
            if (r0 != r3) goto L48
            return r3
        L48:
            r6 = r10
            goto L4d
        L4a:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> Lde
        L4d:
            java.util.Map<java.lang.Long, X.1Ti> r0 = r6.LJ     // Catch: java.lang.Exception -> Lde
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> Lde
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> Lde
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Exception -> Lde
        L59:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto L91
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Exception -> Lde
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> Lde
            java.lang.Object r0 = r1.getKey()     // Catch: java.lang.Exception -> Lde
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> Lde
            r0.longValue()     // Catch: java.lang.Exception -> Lde
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Exception -> Lde
            X.1Ti r0 = (X.C33541Ti) r0     // Catch: java.lang.Exception -> Lde
            java.util.List<webcast.data.MusicSong> r0 = r0.LJLIL     // Catch: java.lang.Exception -> Lde
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> Lde
        L7a:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto L59
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Exception -> Lde
            webcast.data.MusicSong r5 = (webcast.data.MusicSong) r5     // Catch: java.lang.Exception -> Lde
            long r3 = r5.id     // Catch: java.lang.Exception -> Lde
            long r1 = r11.id     // Catch: java.lang.Exception -> Lde
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L7a
            r5.isFavourite = r8     // Catch: java.lang.Exception -> Lde
            goto L7a
        L91:
            java.util.Map<java.lang.Long, X.1Ti> r3 = r6.LJ     // Catch: java.lang.Exception -> Lde
            long r1 = r6.LIZIZ     // Catch: java.lang.Exception -> Lde
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Exception -> Lde
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lde
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Exception -> Lde
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> Lde
            X.1Ti r0 = (X.C33541Ti) r0     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto Lc3
            java.util.List<webcast.data.MusicSong> r0 = r0.LJLIL     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto Lc3
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Exception -> Lde
        Lac:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Exception -> Lde
            webcast.data.MusicSong r0 = (webcast.data.MusicSong) r0     // Catch: java.lang.Exception -> Lde
            long r3 = r0.id     // Catch: java.lang.Exception -> Lde
            long r1 = r11.id     // Catch: java.lang.Exception -> Lde
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lac
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> Lde
            return r0
        Lc3:
            java.util.Map<java.lang.Long, X.1Ti> r3 = r6.LJ     // Catch: java.lang.Exception -> Lde
            long r1 = r6.LIZIZ     // Catch: java.lang.Exception -> Lde
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Exception -> Lde
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lde
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Exception -> Lde
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> Lde
            X.1Ti r0 = (X.C33541Ti) r0     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto Lde
            java.util.List<webcast.data.MusicSong> r1 = r0.LJLIL     // Catch: java.lang.Exception -> Lde
            if (r1 == 0) goto Lde
            r0 = 0
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r1, r0, r11)     // Catch: java.lang.Exception -> Lde
        Lde:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14410hR.LIZ(webcast.data.MusicSong, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:54|55))(3:56|57|(1:59)(1:60))|12|(4:15|(4:18|(3:20|21|22)(1:24)|23|16)|25|13)|26|27|(3:31|(4:34|(3:36|37|(3:42|43|44))(1:48)|45|32)|49)|51|52))|62|6|7|(0)(0)|12|(1:13)|26|27|(4:29|31|(1:32)|49)|51|52) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:11:0x004a, B:12:0x004d, B:13:0x0059, B:15:0x005f, B:16:0x007a, B:18:0x0080, B:21:0x008e, B:27:0x0092, B:29:0x00a5, B:31:0x00a9, B:32:0x00ad, B:34:0x00b3, B:37:0x00c1, B:40:0x00d4, B:43:0x00d8, B:57:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:11:0x004a, B:12:0x004d, B:13:0x0059, B:15:0x005f, B:16:0x007a, B:18:0x0080, B:21:0x008e, B:27:0x0092, B:29:0x00a5, B:31:0x00a9, B:32:0x00ad, B:34:0x00b3, B:37:0x00c1, B:40:0x00d4, B:43:0x00d8, B:57:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(webcast.data.MusicSong r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C516821c
            if (r0 == 0) goto L22
            r5 = r11
            X.21c r5 = (X.C516821c) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            webcast.data.MusicSong r10 = r5.LJLILLLLZI
            X.0hR r6 = r5.LJLIL
            goto L4a
        L22:
            X.21c r5 = new X.21c
            r5.<init>(r9, r11)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            X.XIA r2 = X.C78613UtF.LIZJ     // Catch: java.lang.Exception -> Ldc
            X.2Ei r1 = new X.2Ei     // Catch: java.lang.Exception -> Ldc
            r0 = 0
            r1.<init>(r9, r10, r0)     // Catch: java.lang.Exception -> Ldc
            r5.LJLIL = r9     // Catch: java.lang.Exception -> Ldc
            r5.LJLILLLLZI = r10     // Catch: java.lang.Exception -> Ldc
            r5.LJLJJL = r3     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r5)     // Catch: java.lang.Exception -> Ldc
            if (r0 != r4) goto L48
            return r4
        L48:
            r6 = r9
            goto L4d
        L4a:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> Ldc
        L4d:
            java.util.Map<java.lang.Long, X.1Ti> r0 = r6.LJ     // Catch: java.lang.Exception -> Ldc
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> Ldc
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> Ldc
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Exception -> Ldc
        L59:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L92
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> Ldc
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r0 = r1.getKey()     // Catch: java.lang.Exception -> Ldc
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> Ldc
            r0.longValue()     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Exception -> Ldc
            X.1Ti r0 = (X.C33541Ti) r0     // Catch: java.lang.Exception -> Ldc
            java.util.List<webcast.data.MusicSong> r0 = r0.LJLIL     // Catch: java.lang.Exception -> Ldc
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> Ldc
        L7a:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L59
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Exception -> Ldc
            webcast.data.MusicSong r5 = (webcast.data.MusicSong) r5     // Catch: java.lang.Exception -> Ldc
            long r3 = r5.id     // Catch: java.lang.Exception -> Ldc
            long r1 = r10.id     // Catch: java.lang.Exception -> Ldc
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L7a
            r0 = 0
            r5.isFavourite = r0     // Catch: java.lang.Exception -> Ldc
            goto L7a
        L92:
            java.util.Map<java.lang.Long, X.1Ti> r3 = r6.LJ     // Catch: java.lang.Exception -> Ldc
            long r1 = r6.LIZIZ     // Catch: java.lang.Exception -> Ldc
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Exception -> Ldc
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ldc
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> Ldc
            X.1Ti r0 = (X.C33541Ti) r0     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Ldc
            java.util.List<webcast.data.MusicSong> r0 = r0.LJLIL     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Ldc
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> Ldc
        Lad:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Ldc
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Exception -> Ldc
            webcast.data.MusicSong r5 = (webcast.data.MusicSong) r5     // Catch: java.lang.Exception -> Ldc
            long r3 = r5.id     // Catch: java.lang.Exception -> Ldc
            long r1 = r10.id     // Catch: java.lang.Exception -> Ldc
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lad
            java.util.Map<java.lang.Long, X.1Ti> r3 = r6.LJ     // Catch: java.lang.Exception -> Ldc
            long r1 = r6.LIZIZ     // Catch: java.lang.Exception -> Ldc
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Exception -> Ldc
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ldc
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> Ldc
            X.1Ti r0 = (X.C33541Ti) r0     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Lad
            java.util.List<webcast.data.MusicSong> r0 = r0.LJLIL     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Lad
            r0.remove(r5)     // Catch: java.lang.Exception -> Ldc
            goto Lad
        Ldc:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14410hR.LIZIZ(webcast.data.MusicSong, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x0134, TryCatch #2 {Exception -> 0x0134, blocks: (B:19:0x005f, B:17:0x0061, B:25:0x006a, B:27:0x006e, B:28:0x0077, B:30:0x007d, B:32:0x0088, B:35:0x0090, B:40:0x00a0, B:48:0x00a5, B:50:0x00b2, B:52:0x00b6, B:54:0x00bf, B:56:0x00de, B:57:0x00e2, B:59:0x00e8, B:62:0x00f2, B:67:0x010b, B:68:0x011a, B:70:0x0120, B:75:0x00ba), top: B:18:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[Catch: Exception -> 0x0134, TryCatch #2 {Exception -> 0x0134, blocks: (B:19:0x005f, B:17:0x0061, B:25:0x006a, B:27:0x006e, B:28:0x0077, B:30:0x007d, B:32:0x0088, B:35:0x0090, B:40:0x00a0, B:48:0x00a5, B:50:0x00b2, B:52:0x00b6, B:54:0x00bf, B:56:0x00de, B:57:0x00e2, B:59:0x00e8, B:62:0x00f2, B:67:0x010b, B:68:0x011a, B:70:0x0120, B:75:0x00ba), top: B:18:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[Catch: Exception -> 0x0134, TryCatch #2 {Exception -> 0x0134, blocks: (B:19:0x005f, B:17:0x0061, B:25:0x006a, B:27:0x006e, B:28:0x0077, B:30:0x007d, B:32:0x0088, B:35:0x0090, B:40:0x00a0, B:48:0x00a5, B:50:0x00b2, B:52:0x00b6, B:54:0x00bf, B:56:0x00de, B:57:0x00e2, B:59:0x00e8, B:62:0x00f2, B:67:0x010b, B:68:0x011a, B:70:0x0120, B:75:0x00ba), top: B:18:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120 A[Catch: Exception -> 0x0134, LOOP:2: B:68:0x011a->B:70:0x0120, LOOP_END, TryCatch #2 {Exception -> 0x0134, blocks: (B:19:0x005f, B:17:0x0061, B:25:0x006a, B:27:0x006e, B:28:0x0077, B:30:0x007d, B:32:0x0088, B:35:0x0090, B:40:0x00a0, B:48:0x00a5, B:50:0x00b2, B:52:0x00b6, B:54:0x00bf, B:56:0x00de, B:57:0x00e2, B:59:0x00e8, B:62:0x00f2, B:67:0x010b, B:68:0x011a, B:70:0x0120, B:75:0x00ba), top: B:18:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.bytedance.ies.sdk.datachannel.DataChannel r12, X.InterfaceC67352kd<? super java.util.List<X.C33511Tf>> r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14410hR.LJ(com.bytedance.ies.sdk.datachannel.DataChannel, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(long r15, X.InterfaceC67352kd<? super java.lang.Long> r17) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14410hR.LJI(long, X.2kd):java.lang.Object");
    }
}
