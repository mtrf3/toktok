package com.bytedance.android.live.effect.music;

import X.C14260hC;
import X.C14320hI;
import X.C221108m2;
import X.C29306Beo;
import X.C2EQ;
import X.C34031Vf;
import X.C34041Vg;
import X.C5H3;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78934UyQ;
import X.C78996UzQ;
import X.C79853Bl;
import X.EnumC58928NAu;
import X.InterfaceC14440hU;
import X.InterfaceC67352kd;
import X.ORZ;
import X.XK4;
import X.XKX;
import X.XLL;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.livesdk.dataChannel.BGMPlaylistInitial;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* loaded from: classes.dex */
public final class BGMPlaylistViewModel extends ViewModel {
    public final C14320hI LJLIL;
    public final XK4 LJLILLLLZI;
    public final XLL LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C5H3 LJLJLLL;

    public final List<MusicSong> jv0() {
        return ORZ.LLJI(this.LJLIL.LIZIZ);
    }

    public static void rv0(Throwable th) {
        C29306Beo.LJJJ(new IDqS420S0100000(th, 53));
    }

    public final Object hv0(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        boolean LJII = this.LJLIL.LJII();
        if (LJII != this.LJLJJL) {
            this.LJLJJL = LJII;
            Object emit = this.LJLJI.emit(C34041Vg.LIZ, interfaceC67352kd);
            if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return emit;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    public final Object iv0(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        boolean z;
        C14320hI c14320hI = this.LJLIL;
        if (((ArrayList) c14320hI.LIZIZ).isEmpty() || c14320hI.LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LJLJJI) {
            this.LJLJJI = z;
            Object emit = this.LJLJI.emit(C34031Vf.LIZ, interfaceC67352kd);
            if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return emit;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(1:(8:12|13|14|15|16|(1:18)|19|20)(2:25|26))(9:27|28|29|(2:31|32)|15|16|(0)|19|20))(2:34|35))(3:39|(1:56)(1:43)|(2:45|46)(4:47|48|49|(1:51)(1:52)))|36|(1:38)|29|(0)|15|16|(0)|19|20))|58|6|7|(0)(0)|36|(0)|29|(0)|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C47411tZ
            if (r0 == 0) goto L27
            r8 = r12
            X.1tZ r8 = (X.C47411tZ) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r2 = r8.LJLILLLLZI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r1 = 1
            r5 = 0
            r9 = 3
            r10 = 2
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L38
            if (r0 == r10) goto L35
            if (r0 != r9) goto L2d
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r6 = r8.LJLIL
            goto L8a
        L27:
            X.1tZ r8 = new X.1tZ
            r8.<init>(r11, r12)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r6 = r8.LJLIL
            goto L7a
        L38:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r6 = r8.LJLIL
            goto L5f
        L3b:
            X.C141335gf.LIZJ(r2)
            boolean r0 = r11.LJLJJLL
            if (r0 != 0) goto L4c
            boolean r0 = r11.LJLJJL
            if (r0 != 0) goto L4c
            r0 = 1
        L47:
            if (r0 != 0) goto L4e
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4c:
            r0 = 0
            goto L47
        L4e:
            r11.LJLJJLL = r1
            X.0hI r0 = r11.LJLIL     // Catch: java.lang.Throwable -> L96
            r8.LJLIL = r11     // Catch: java.lang.Throwable -> L96
            r8.LJLJJI = r1     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.LJFF(r8)     // Catch: java.lang.Throwable -> L96
            if (r0 != r7) goto L5d
            return r7
        L5d:
            r6 = r11
            goto L62
        L5f:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L99
        L62:
            X.XLL r4 = r6.LJLJI     // Catch: java.lang.Throwable -> L99
            X.1Ve r3 = new X.1Ve     // Catch: java.lang.Throwable -> L99
            java.util.List r2 = r6.jv0()     // Catch: java.lang.Throwable -> L99
            r1 = 0
            r0 = 6
            r3.<init>(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> L99
            r8.LJLIL = r6     // Catch: java.lang.Throwable -> L99
            r8.LJLJJI = r10     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r4.emit(r3, r8)     // Catch: java.lang.Throwable -> L99
            if (r0 != r7) goto L7d
            return r7
        L7a:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L99
        L7d:
            r6.LJLJJLL = r5     // Catch: java.lang.Throwable -> L99
            r8.LJLIL = r6     // Catch: java.lang.Throwable -> L99
            r8.LJLJJI = r9     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r6.hv0(r8)     // Catch: java.lang.Throwable -> L99
            if (r0 != r7) goto L8d
            goto L95
        L8a:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L93
        L8d:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L93
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L93
            goto La1
        L93:
            r0 = move-exception
            goto L9a
        L95:
            return r7
        L96:
            r0 = move-exception
            r6 = r11
            goto L9a
        L99:
            r0 = move-exception
        L9a:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        La1:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r0 == 0) goto Lac
            r6.LJLJJLL = r5
            rv0(r0)
        Lac:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.kv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(1:(8:12|13|14|15|16|(1:18)|19|20)(2:25|26))(9:27|28|29|(2:31|32)|15|16|(0)|19|20))(2:34|35))(3:39|(1:56)(1:43)|(2:45|46)(4:47|48|49|(1:51)(1:52)))|36|(1:38)|29|(0)|15|16|(0)|19|20))|58|6|7|(0)(0)|36|(0)|29|(0)|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C47421ta
            if (r0 == 0) goto L27
            r8 = r12
            X.1ta r8 = (X.C47421ta) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r10 = r8.LJLILLLLZI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r1 = 1
            r5 = 0
            r9 = 3
            r6 = 2
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L38
            if (r0 == r6) goto L35
            if (r0 != r9) goto L2d
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r4 = r8.LJLIL
            goto L8b
        L27:
            X.1ta r8 = new X.1ta
            r8.<init>(r11, r12)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r4 = r8.LJLIL
            goto L7b
        L38:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r4 = r8.LJLIL
            goto L5f
        L3b:
            X.C141335gf.LIZJ(r10)
            boolean r0 = r11.LJLJL
            if (r0 != 0) goto L4c
            boolean r0 = r11.LJLJJI
            if (r0 != 0) goto L4c
            r0 = 1
        L47:
            if (r0 != 0) goto L4e
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4c:
            r0 = 0
            goto L47
        L4e:
            r11.LJLJL = r1
            X.0hI r0 = r11.LJLIL     // Catch: java.lang.Throwable -> L97
            r8.LJLIL = r11     // Catch: java.lang.Throwable -> L97
            r8.LJLJJI = r1     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r0.LJI(r8)     // Catch: java.lang.Throwable -> L97
            if (r10 != r7) goto L5d
            return r7
        L5d:
            r4 = r11
            goto L62
        L5f:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L9a
        L62:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L9a
            X.XLL r3 = r4.LJLJI     // Catch: java.lang.Throwable -> L9a
            X.1Ve r2 = new X.1Ve     // Catch: java.lang.Throwable -> L9a
            java.util.List r1 = r4.jv0()     // Catch: java.lang.Throwable -> L9a
            r0 = 4
            r2.<init>(r1, r10, r5, r0)     // Catch: java.lang.Throwable -> L9a
            r8.LJLIL = r4     // Catch: java.lang.Throwable -> L9a
            r8.LJLJJI = r6     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r3.emit(r2, r8)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r7) goto L7e
            return r7
        L7b:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L9a
        L7e:
            r4.LJLJL = r5     // Catch: java.lang.Throwable -> L9a
            r8.LJLIL = r4     // Catch: java.lang.Throwable -> L9a
            r8.LJLJJI = r9     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r4.iv0(r8)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r7) goto L8e
            goto L96
        L8b:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L94
        L8e:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L94
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L94
            goto La2
        L94:
            r0 = move-exception
            goto L9b
        L96:
            return r7
        L97:
            r0 = move-exception
            r4 = r11
            goto L9b
        L9a:
            r0 = move-exception
        L9b:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        La2:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r0 == 0) goto Lad
            r4.LJLJJLL = r5
            rv0(r0)
        Lad:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.lv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(1:(8:12|13|14|15|16|(1:18)|19|20)(2:25|26))(9:27|28|29|(2:31|32)|15|16|(0)|19|20))(2:34|35))(4:39|40|41|(1:43)(1:44))|36|(1:38)|29|(0)|15|16|(0)|19|20))|49|6|7|(0)(0)|36|(0)|29|(0)|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nv0(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C47431tb
            if (r0 == 0) goto L27
            r9 = r12
            X.1tb r9 = (X.C47431tb) r9
            int r2 = r9.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r9.LJLJJI = r2
        L12:
            java.lang.Object r2 = r9.LJLILLLLZI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJJI
            r10 = 0
            r7 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L38
            if (r0 == r6) goto L35
            if (r0 != r7) goto L2d
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r5 = r9.LJLIL
            goto L74
        L27:
            X.1tb r9 = new X.1tb
            r9.<init>(r11, r12)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r5 = r9.LJLIL
            goto L66
        L38:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r5 = r9.LJLIL
            goto L4d
        L3b:
            X.C141335gf.LIZJ(r2)
            X.0hI r0 = r11.LJLIL     // Catch: java.lang.Throwable -> L80
            r9.LJLIL = r11     // Catch: java.lang.Throwable -> L80
            r9.LJLJJI = r1     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.LJIIIIZZ(r9)     // Catch: java.lang.Throwable -> L80
            if (r0 != r8) goto L4b
            return r8
        L4b:
            r5 = r11
            goto L50
        L4d:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L83
        L50:
            X.XLL r4 = r5.LJLJI     // Catch: java.lang.Throwable -> L83
            X.1Ve r3 = new X.1Ve     // Catch: java.lang.Throwable -> L83
            X.OQg r2 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> L83
            r1 = 0
            r0 = 6
            r3.<init>(r2, r10, r1, r0)     // Catch: java.lang.Throwable -> L83
            r9.LJLIL = r5     // Catch: java.lang.Throwable -> L83
            r9.LJLJJI = r6     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r4.emit(r3, r9)     // Catch: java.lang.Throwable -> L83
            if (r0 != r8) goto L69
            return r8
        L66:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L83
        L69:
            r9.LJLIL = r5     // Catch: java.lang.Throwable -> L83
            r9.LJLJJI = r7     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r5.qv0(r10, r9)     // Catch: java.lang.Throwable -> L83
            if (r0 != r8) goto L77
            goto L7f
        L74:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L7d
        L77:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L7d
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L7d
            goto L8b
        L7d:
            r0 = move-exception
            goto L84
        L7f:
            return r8
        L80:
            r0 = move-exception
            r5 = r11
            goto L84
        L83:
            r0 = move-exception
        L84:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L8b:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r0 == 0) goto L97
            r5.getClass()
            rv0(r0)
        L97:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.nv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(17:5|6|7|(1:(1:(1:(1:(1:(8:14|15|16|17|18|(1:20)|21|22)(2:27|28))(9:29|30|31|(2:33|34)|17|18|(0)|21|22))(11:36|37|38|(1:40)|31|(0)|17|18|(0)|21|22))(13:41|42|43|(1:45)|38|(0)|31|(0)|17|18|(0)|21|22))(2:46|47))(4:51|52|53|(1:55)(1:56))|48|(1:50)|43|(0)|38|(0)|31|(0)|17|18|(0)|21|22))|61|6|7|(0)(0)|48|(0)|43|(0)|38|(0)|31|(0)|17|18|(0)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pv0(X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.pv0(X.2kd):java.lang.Object");
    }

    public BGMPlaylistViewModel(C14320hI playlistRepository, DataChannel dataChannel) {
        o.LJIIIZ(playlistRepository, "playlistRepository");
        this.LJLIL = playlistRepository;
        this.LJLILLLLZI = C78934UyQ.LIZJ(Integer.MAX_VALUE, null, 6);
        this.LJLJI = C79853Bl.LIZ(0, 10, null, 4);
        this.LJLJLJ = C221108m2.LIZIZ(new IDqS420S0100000(this, 52));
        this.LJLJLLL = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 51));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2EQ(this, null), 3);
        C14260hC.LIZ(new InterfaceC14440hU() { // from class: X.1Ta
            @Override // X.InterfaceC14440hU
            public final void LJJJLL() {
            }

            @Override // X.InterfaceC14440hU
            public final void h9() {
            }

            @Override // X.InterfaceC14440hU
            public final void Ee() {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(BGMPlaylistViewModel.this), null, null, new C2ER(BGMPlaylistViewModel.this, null), 3);
            }
        });
        playlistRepository.LIZLLL = new IDqS416S0100000(this, 70);
        if (dataChannel != null) {
            dataChannel.lv0(null, BGMPlaylistInitial.class, new IDqS416S0100000(this, 71));
        }
    }

    public static Object mv0(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC67352kd interfaceC67352kd) {
        Long l;
        MusicSong LJ = bGMPlaylistViewModel.LJLIL.LJ();
        if (LJ != null) {
            Object qv0 = bGMPlaylistViewModel.qv0(LJ, interfaceC67352kd);
            if (qv0 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return qv0;
            }
            return C76800UCe.LIZ;
        }
        MusicSong musicSong = bGMPlaylistViewModel.LJLIL.LJ;
        if (musicSong != null) {
            Long l2 = new Long(musicSong.id);
            MusicSong musicSong2 = (MusicSong) ORZ.LLFII(bGMPlaylistViewModel.jv0());
            if (musicSong2 != null) {
                l = new Long(musicSong2.id);
            } else {
                l = null;
            }
            if (o.LJ(l2, l) && bGMPlaylistViewModel.LJLJJL) {
                Object pv0 = bGMPlaylistViewModel.pv0(interfaceC67352kd);
                if (pv0 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return pv0;
                }
                return C76800UCe.LIZ;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:3|(15:5|6|7|(2:52|(1:(1:(7:56|57|41|42|(1:44)|45|46)(2:58|59))(11:60|61|33|(1:37)|38|(1:40)|41|42|(0)|45|46))(2:62|63))(5:9|(4:12|(3:14|15|16)(1:18)|17|10)|19|20|(2:22|23)(3:25|26|(1:28)(1:29)))|30|(1:32)|33|(2:35|37)|38|(0)|41|42|(0)|45|46))|66|6|7|(0)(0)|30|(0)|33|(0)|38|(0)|41|42|(0)|45|46|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:57:0x00cb, B:41:0x00ce, B:33:0x00a5, B:35:0x00ab, B:37:0x00b5, B:38:0x00b8, B:30:0x0088), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(java.util.List<webcast.data.MusicSong> r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.gv0(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(1:(8:16|17|18|19|20|(1:22)|23|24)(2:13|14))(9:28|29|30|(1:(2:33|(1:35))(1:(2:37|(2:39|40))))|19|20|(0)|23|24))(3:41|42|43))(2:50|(7:52|(1:54)(1:76)|(4:58|(1:60)(1:74)|61|(4:65|66|67|(1:69)(1:70)))|75|66|67|(0)(0))(2:77|78))|44|(2:46|47)|30|(0)|19|20|(0)|23|24))|80|6|7|(0)(0)|44|(0)|30|(0)|19|20|(0)|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.bytedance.android.live.effect.music.BGMPlaylistViewModel] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.bytedance.android.live.effect.music.BGMPlaylistViewModel] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ov0(webcast.data.MusicSong r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.ov0(webcast.data.MusicSong, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object qv0(webcast.data.MusicSong r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C47461te
            if (r0 == 0) goto Lc4
            r5 = r13
            X.1te r5 = (X.C47461te) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc4
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L12:
            java.lang.Object r9 = r5.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJLL
            r6 = 10
            r8 = 2
            r10 = 1
            r3 = 3
            r2 = 0
            if (r0 == 0) goto L34
            if (r0 == r10) goto L2c
            if (r0 == r8) goto La5
            if (r0 != r3) goto Lcb
            X.C141335gf.LIZJ(r9)
        L29:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            webcast.data.MusicSong r12 = r5.LJLILLLLZI
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r7 = r5.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L73
        L34:
            X.C141335gf.LIZJ(r9)
            X.0hI r0 = r11.LJLIL
            webcast.data.MusicSong r9 = r0.LJ
            if (r12 == 0) goto L4a
            java.util.List r0 = r11.jv0()
            boolean r0 = r0.contains(r12)
            if (r0 != 0) goto L4a
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4a:
            X.0hI r0 = r11.LJLIL
            r0.LJ = r12
            X.J0d<java.lang.Long> r7 = X.InterfaceC30442Bx8.S
            if (r12 == 0) goto L6f
            long r0 = r12.id
        L54:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.LIZ(r0)
            X.XLL r1 = r11.LJLJI
            X.1Vh r0 = new X.1Vh
            r0.<init>(r12, r9)
            r5.LJLIL = r11
            r5.LJLILLLLZI = r12
            r5.LJLJJLL = r10
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r4) goto L72
            return r4
        L6f:
            r0 = -1
            goto L54
        L72:
            r7 = r11
        L73:
            r0 = 0
            X.C14260hC.LJ(r0, r3)
            X.Ol8 r0 = r7.LJLJLJ
            java.lang.Object r1 = r0.getValue()
            X.0hP r1 = (X.C14390hP) r1
            X.0hI r0 = r7.LJLIL
            webcast.data.MusicSong r0 = r0.LJ
            r1.LIZ(r0)
            X.C14360hM.LIZ = r12
            X.0hI r0 = r7.LJLIL
            java.lang.Integer r0 = r0.LIZLLL(r12)
            if (r0 == 0) goto L29
            int r1 = r0.intValue()
            if (r1 >= r6) goto Lac
            r5.LJLIL = r7
            r5.LJLILLLLZI = r2
            r5.LJLJI = r1
            r5.LJLJJLL = r8
            java.lang.Object r0 = r7.lv0(r5)
            if (r0 != r4) goto Lac
            return r4
        La5:
            int r1 = r5.LJLJI
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r7 = r5.LJLIL
            X.C141335gf.LIZJ(r9)
        Lac:
            java.util.List r0 = r7.jv0()
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r0 >= r6) goto L29
            r5.LJLIL = r2
            r5.LJLILLLLZI = r2
            r5.LJLJJLL = r3
            java.lang.Object r0 = r7.kv0(r5)
            if (r0 != r4) goto L29
            return r4
        Lc4:
            X.1te r5 = new X.1te
            r5.<init>(r11, r13)
            goto L12
        Lcb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.qv0(webcast.data.MusicSong, X.2kd):java.lang.Object");
    }
}
