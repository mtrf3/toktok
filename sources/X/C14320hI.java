package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.MusicSong;

/* renamed from: X.0hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14320hI {
    public long LIZJ;
    public InterfaceC88472Yns<? super Long, C76800UCe> LIZLLL;
    public MusicSong LJ;
    public boolean LJFF;
    public long LIZ = -1;
    public List<MusicSong> LIZIZ = new ArrayList();
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C21Q.LJLIL);

    public final AccompanimentApi LIZJ() {
        return (AccompanimentApi) this.LJI.getValue();
    }

    public final MusicSong LJ() {
        Integer LIZLLL = LIZLLL(this.LJ);
        if (LIZLLL != null) {
            int intValue = LIZLLL.intValue() + 1;
            if (intValue < ((ArrayList) this.LIZIZ).size()) {
                return (MusicSong) ListProtector.get(this.LIZIZ, intValue);
            }
            if (this.LIZ == 0 && LJII()) {
                return (MusicSong) ORZ.LJLLJ(this.LIZIZ);
            }
        }
        return null;
    }

    public final boolean LJII() {
        if (this.LIZIZ.isEmpty() || this.LIZ + this.LIZIZ.size() >= this.LIZJ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21R
            if (r0 == 0) goto L5e
            r5 = r7
            X.21R r5 = (X.C21R) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L46
            if (r0 != r3) goto L6a
            X.0hI r3 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r2 = r1.data
            tikcast.api.anchor.PlaylistSongsResponse$ResponseData r2 = (tikcast.api.anchor.PlaylistSongsResponse.ResponseData) r2
            if (r2 == 0) goto L64
            long r0 = r2.total
            r3.LJIIJJI(r0)
            r0 = 0
            r3.LIZ = r0
            java.util.List<webcast.data.MusicSong> r0 = r3.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<webcast.data.MusicSong> r1 = r3.LIZIZ
            java.util.List<webcast.data.MusicSong> r0 = r2.songs
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L46:
            X.C141335gf.LIZJ(r1)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.2EM r1 = new X.2EM
            r0 = 0
            r1.<init>(r6, r0)
            r5.LJLIL = r6
            r5.LJLJJI = r3
            java.lang.Object r1 = X.XKX.LJI(r2, r1, r5)
            if (r1 != r4) goto L5c
            return r4
        L5c:
            r3 = r6
            goto L22
        L5e:
            X.21R r5 = new X.21R
            r5.<init>(r6, r7)
            goto L12
        L64:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320hI.LIZIZ(X.2kd):java.lang.Object");
    }

    public final Integer LIZLLL(MusicSong musicSong) {
        if (musicSong == null) {
            return null;
        }
        Iterator<MusicSong> it = this.LIZIZ.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().id == musicSong.id) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            return null;
        }
        return valueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21S
            if (r0 == 0) goto L5f
            r7 = r9
            X.21S r7 = (X.C21S) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 1
            if (r0 == 0) goto L3b
            if (r0 != r5) goto L6b
            X.0hI r3 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r2 = r1.data
            tikcast.api.anchor.PlaylistSongsResponse$ResponseData r2 = (tikcast.api.anchor.PlaylistSongsResponse.ResponseData) r2
            if (r2 == 0) goto L65
            java.util.List<webcast.data.MusicSong> r1 = r3.LIZIZ
            java.util.List<webcast.data.MusicSong> r0 = r2.songs
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            long r0 = r2.total
            r3.LJIIJJI(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3b:
            X.C141335gf.LIZJ(r1)
            long r3 = r8.LIZ
            java.util.List<webcast.data.MusicSong> r0 = r8.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            long r0 = (long) r0
            long r3 = r3 + r0
            X.XIA r2 = X.C78613UtF.LIZJ
            X.2EN r1 = new X.2EN
            r0 = 0
            r1.<init>(r8, r3, r0)
            r7.LJLIL = r8
            r7.LJLJJI = r5
            java.lang.Object r1 = X.XKX.LJI(r2, r1, r7)
            if (r1 != r6) goto L5d
            return r6
        L5d:
            r3 = r8
            goto L22
        L5f:
            X.21S r7 = new X.21S
            r7.<init>(r8, r9)
            goto L12
        L65:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320hI.LJFF(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC67352kd<? super java.util.List<webcast.data.MusicSong>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21T
            if (r0 == 0) goto L6c
            r6 = r9
            X.21T r6 = (X.C21T) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r5 = 1
            if (r0 == 0) goto L48
            if (r0 != r5) goto L78
            X.0hI r5 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r4 = r1.data
            tikcast.api.anchor.PlaylistSongsResponse$ResponseData r4 = (tikcast.api.anchor.PlaylistSongsResponse.ResponseData) r4
            if (r4 == 0) goto L72
            java.util.List<webcast.data.MusicSong> r2 = r5.LIZIZ
            java.util.List<webcast.data.MusicSong> r1 = r4.songs
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0 = 0
            r2.addAll(r0, r1)
            long r2 = r5.LIZ
            java.util.List<webcast.data.MusicSong> r0 = r4.songs
            int r0 = r0.size()
            long r0 = (long) r0
            long r2 = r2 - r0
            r5.LIZ = r2
            long r0 = r4.total
            r5.LJIIJJI(r0)
            java.util.List<webcast.data.MusicSong> r0 = r4.songs
            return r0
        L48:
            X.C141335gf.LIZJ(r1)
            long r2 = r8.LIZ
            r0 = 50
            long r0 = (long) r0
            long r2 = r2 - r0
            r0 = 0
            long r3 = java.lang.Math.max(r2, r0)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.2EO r1 = new X.2EO
            r0 = 0
            r1.<init>(r8, r3, r0)
            r6.LJLIL = r8
            r6.LJLJJI = r5
            java.lang.Object r1 = X.XKX.LJI(r2, r1, r6)
            if (r1 != r7) goto L6a
            return r7
        L6a:
            r5 = r8
            goto L22
        L6c:
            X.21T r6 = new X.21T
            r6.<init>(r8, r9)
            goto L12
        L72:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320hI.LJI(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C21U
            if (r0 == 0) goto L48
            r4 = r6
            X.21U r4 = (X.C21U) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L4e
            X.0hI r0 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.lang.String r1 = "0"
            int r0 = X.C14260hC.LIZJ
            X.C14360hM.LIZJ(r0, r1)
            r0 = 0
            X.C14260hC.LIZJ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L36:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r5
            r4.LJLJJI = r0
            r0 = -1
            java.lang.Object r0 = r5.LJIIJ(r0, r4)
            if (r0 != r2) goto L46
            return r2
        L46:
            r0 = r5
            goto L22
        L48:
            X.21U r4 = new X.21U
            r4.<init>(r5, r6)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320hI.LJIIIIZZ(X.2kd):java.lang.Object");
    }

    public final void LJIIJJI(long j) {
        this.LIZJ = j;
        InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns = this.LIZLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Long.valueOf(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<webcast.data.MusicSong> r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320hI.LIZ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(int r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C21V
            if (r0 == 0) goto L48
            r4 = r7
            X.21V r4 = (X.C21V) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r1 = r4.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJL
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L4e
            int r6 = r4.LJLILLLLZI
            X.0hI r0 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L24:
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZIZ
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r0, r6)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            X.C141335gf.LIZJ(r1)
            java.util.List<webcast.data.MusicSong> r0 = r5.LIZIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            webcast.data.MusicSong r0 = (webcast.data.MusicSong) r0
            long r0 = r0.id
            r4.LJLIL = r5
            r4.LJLILLLLZI = r6
            r4.LJLJJL = r2
            java.lang.Object r0 = r5.LJIIJ(r0, r4)
            if (r0 != r3) goto L46
            return r3
        L46:
            r0 = r5
            goto L24
        L48:
            X.21V r4 = new X.21V
            r4.<init>(r5, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320hI.LJIIIZ(int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(long r7, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C21W
            if (r0 == 0) goto L4a
            r5 = r9
            X.21W r5 = (X.C21W) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L56
            X.0hI r2 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r0 = r1.data
            tikcast.api.anchor.PlaylistDeleteResponse$ResponseData r0 = (tikcast.api.anchor.PlaylistDeleteResponse.ResponseData) r0
            if (r0 == 0) goto L50
            long r0 = r0.total
            r2.LJIIJJI(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L32:
            X.C141335gf.LIZJ(r1)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.2EP r1 = new X.2EP
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LJLIL = r6
            r5.LJLJJI = r3
            java.lang.Object r1 = X.XKX.LJI(r2, r1, r5)
            if (r1 != r4) goto L48
            return r4
        L48:
            r2 = r6
            goto L22
        L4a:
            X.21W r5 = new X.21W
            r5.<init>(r6, r9)
            goto L12
        L50:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320hI.LJIIJ(long, X.2kd):java.lang.Object");
    }
}
