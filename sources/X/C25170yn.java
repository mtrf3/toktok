package X;

import com.aweme.ttkvstorage.UpdateRegisterKeyImpl;
import com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey;
import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.0yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25170yn {
    public static final ConcurrentHashMap<String, InterfaceC32651Px> LIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC32651Px LIZ(final C09170Xp c09170Xp, final String str) {
        String str2;
        String str3;
        String str4;
        InterfaceC16890lR interfaceC16890lR;
        C09560Zc c09560Zc;
        C1OX c1ox;
        final InterfaceC32651Px interfaceC32651Px;
        InterfaceC32651Px c42381lS;
        String LIZ2;
        String str5;
        if (C19460pa.LIZ == null) {
            IUserAccount LIZIZ = UserAccountImpl.LIZIZ();
            C19460pa.LIZ = LIZIZ;
            if (LIZIZ != null) {
                str5 = LIZIZ.getCurrentUid();
            } else {
                str5 = null;
            }
            C09190Xr.LIZ(str5);
        }
        IUserAccount iUserAccount = C19460pa.LIZ;
        if (iUserAccount == null || (str2 = iUserAccount.getCurrentUid()) == null) {
            str2 = "unlogin";
        }
        C25160ym c25160ym = new C25160ym(str2, c09170Xp, str);
        if (o.LJ(str2, "global")) {
            str2 = null;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        String str6 = "";
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        LIZ3.append(str3);
        if (c09170Xp != null && (LIZ2 = c09170Xp.LIZ("")) != null) {
            str6 = LIZ2;
        }
        LIZ3.append(str6);
        LIZ3.append(c25160ym.LIZ.name());
        LIZ3.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        InterfaceC32651Px interfaceC32651Px2 = LIZ.get(LIZIZ2);
        if (interfaceC32651Px2 != null) {
            return interfaceC32651Px2;
        }
        C68322mC c68322mC = new C68322mC();
        IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000(c25160ym, (C25160ym) c68322mC, (C68322mC<C09560Zc>) 91);
        C09570Zd c09570Zd = C09190Xr.LIZJ;
        iDqS172S0200000.invoke(c09570Zd);
        C09180Xq c09180Xq = new C09180Xq(str2, c09570Zd);
        if (str2 != null) {
            C09560Zc c09560Zc2 = (C09560Zc) c68322mC.element;
            HashMap LIZ4 = C25180yo.LIZ(str, c25160ym.LIZ);
            if (LIZ4 != null && c09560Zc2 != null) {
                int LIZJ = C19460pa.LIZJ(c09560Zc2);
                if (c25160ym.LIZ == EnumC10900bm.KEVA) {
                    c42381lS = new C42371lR(LIZJ, null, str, null);
                } else {
                    c42381lS = new C42381lS(LIZJ, null, str, null);
                }
                c09560Zc2.LIZJ = c42381lS;
                c09560Zc2.LIZLLL = (C1OX) LIZ4.get(str);
            }
        }
        C50611yj configBuilder = C50611yj.LJLIL;
        o.LJIIIZ(configBuilder, "configBuilder");
        C09560Zc c09560Zc3 = c09180Xq.LIZIZ.LIZIZ;
        EnumC09550Zb mode = c09560Zc3.LIZ;
        List<? extends InterfaceC15200ii> list = c09560Zc3.LIZIZ;
        InterfaceC32651Px interfaceC32651Px3 = c09560Zc3.LIZJ;
        C1OX c1ox2 = c09560Zc3.LIZLLL;
        InterfaceC10890bl repoFactory = c09560Zc3.LJ;
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(repoFactory, "repoFactory");
        final C09560Zc c09560Zc4 = new C09560Zc(mode, list, interfaceC32651Px3, c1ox2, repoFactory);
        configBuilder.invoke(c09560Zc4);
        InterfaceC16890lR interfaceC16890lR2 = c09180Xq.LIZIZ.LIZ;
        if (interfaceC16890lR2 != null) {
            str4 = interfaceC16890lR2.LJ(str, C19460pa.LIZ(c09180Xq.LIZ, c09170Xp, str).toString(), c09560Zc4.LJ.LJFF());
        } else {
            str4 = null;
        }
        C1UE c1ue = new C1UE(c09560Zc4.LJ.LIZ(c09180Xq.LIZJ, c09170Xp, c09180Xq.LIZ, str));
        c09180Xq.LIZLLL = c1ue;
        if (c09180Xq.LIZ != null && (c1ox = (c09560Zc = c09180Xq.LIZIZ.LIZIZ).LIZLLL) != null && (interfaceC32651Px = c09560Zc.LIZJ) != null) {
            final HashMap<String, String> hashMap = c1ox.LJLIL;
            c1ue.LIZ(new InterfaceC15200ii(interfaceC32651Px, hashMap) { // from class: X.1Qi
                public final InterfaceC32651Px LIZ;
                public final HashMap<String, String> LIZIZ;

                @Override // X.InterfaceC15200ii
                public final AbstractC43131mf LIZ(InterfaceC32651Px targetRepo) {
                    o.LJIIIZ(targetRepo, "targetRepo");
                    return new C514920j(this.LIZ, targetRepo, this.LIZIZ);
                }

                {
                    o.LJIIIZ(hashMap, "migrationKey");
                    this.LIZ = interfaceC32651Px;
                    this.LIZIZ = hashMap;
                }
            });
        }
        final String str7 = c09180Xq.LIZ;
        if (str7 != null) {
            C1UE c1ue2 = c09180Xq.LIZLLL;
            if (c1ue2 != null) {
                final int i = c09180Xq.LIZJ;
                c1ue2.LIZ(new InterfaceC15200ii(str7, c09170Xp, str, i, c09560Zc4) { // from class: X.1Rq
                    public final String LIZ;
                    public final C09170Xp LIZIZ;
                    public final String LIZJ;
                    public final int LIZLLL;
                    public final C09560Zc LJ;

                    @Override // X.InterfaceC15200ii
                    public final AbstractC43131mf LIZ(final InterfaceC32651Px delegate) {
                        o.LJIIIZ(delegate, "delegate");
                        final String str8 = this.LIZ;
                        final C09170Xp c09170Xp2 = this.LIZIZ;
                        final String str9 = this.LIZJ;
                        final int i2 = this.LIZLLL;
                        final C09560Zc c09560Zc5 = this.LJ;
                        return new AbstractC43131mf(delegate, str8, c09170Xp2, str9, i2, c09560Zc5) { // from class: X.21E
                            public String LIZIZ;
                            public final C09170Xp LIZJ;
                            public final String LIZLLL;
                            public final int LJ;
                            public final C09560Zc LJFF;
                            public volatile int LJI;

                            public final void LJII() {
                                IUpdateKVRegisterKey iUpdateKVRegisterKey;
                                InterfaceC10890bl interfaceC10890bl = this.LJFF.LJ;
                                String str10 = this.LIZIZ;
                                InterfaceC32651Px LIZ5 = interfaceC10890bl.LIZ(this.LJ, this.LIZJ, str10, this.LIZLLL);
                                if (this.LIZ instanceof C514920j) {
                                    Object LIZ6 = C58096Mr6.LIZ(IUpdateKVRegisterKey.class, false);
                                    if (LIZ6 != null) {
                                        iUpdateKVRegisterKey = (IUpdateKVRegisterKey) LIZ6;
                                    } else {
                                        if (C58096Mr6.LIZIZ == null) {
                                            synchronized (IUpdateKVRegisterKey.class) {
                                                if (C58096Mr6.LIZIZ == null) {
                                                    C58096Mr6.LIZIZ = new UpdateRegisterKeyImpl();
                                                }
                                            }
                                        }
                                        iUpdateKVRegisterKey = C58096Mr6.LIZIZ;
                                    }
                                    HashMap<String, String> LIZ7 = iUpdateKVRegisterKey.LIZ(this.LIZLLL, this.LIZ.LJFF().name());
                                    InterfaceC32651Px interfaceC32651Px4 = this.LIZ;
                                    o.LJII(interfaceC32651Px4, "null cannot be cast to non-null type com.aweme.kvstorage.migration.KVMigrationFactory.KVMigration");
                                    o.LJIIIZ(LIZ7, "<set-?>");
                                    ((C514920j) interfaceC32651Px4).LIZJ = LIZ7;
                                    InterfaceC32651Px interfaceC32651Px5 = this.LIZ;
                                    o.LJII(interfaceC32651Px5, "null cannot be cast to non-null type com.aweme.kvstorage.migration.KVMigrationFactory.KVMigration");
                                    o.LJIIIZ(LIZ5, "<set-?>");
                                    ((AbstractC43131mf) interfaceC32651Px5).LIZ = LIZ5;
                                    return;
                                }
                                o.LJIIIZ(LIZ5, "<set-?>");
                                this.LIZ = LIZ5;
                            }

                            public final void LJIIIIZZ() {
                                String str10;
                                IUserAccount iUserAccount2 = C19460pa.LIZ;
                                if (iUserAccount2 == null || (str10 = iUserAccount2.getCurrentUid()) == null) {
                                    str10 = CardStruct.IStatusCode.DEFAULT;
                                }
                                int hashCode = str10.hashCode();
                                if (this.LJI != hashCode) {
                                    synchronized (this.LIZIZ) {
                                        if (this.LJI != hashCode) {
                                            this.LIZIZ = str10;
                                            LJII();
                                            this.LJI = hashCode;
                                        }
                                    }
                                }
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC10880bk
                            public final EnumC10900bm LJFF() {
                                LJIIIIZZ();
                                return super.LJFF();
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final void clear() {
                                LJIIIIZZ();
                                super.clear();
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC10880bk
                            public final String getRepoName() {
                                LJIIIIZZ();
                                return super.getRepoName();
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC10880bk
                            public final C17920n6 getUri() {
                                LJIIIIZZ();
                                return super.getUri();
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final void LIZ(String key) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                super.LIZ(key);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final boolean contains(String key) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                return super.contains(key);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final void LIZIZ(String key, String value) {
                                o.LJIIIZ(key, "key");
                                o.LJIIIZ(value, "value");
                                LJIIIIZZ();
                                super.LIZIZ(key, value);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final void LIZJ(String key, long j) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                super.LIZJ(key, j);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final void LIZLLL(String key, int i3) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                super.LIZLLL(key, i3);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final void LJ(String key, double d) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                super.LJ(key, d);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final void LJI(String key, boolean z) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                super.LJI(key, z);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final boolean getBoolean(String key, boolean z) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                return super.getBoolean(key, z);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final double getDouble(String key, double d) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                return super.getDouble(key, d);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final int getInt(String key, int i3) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                return super.getInt(key, i3);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final long getLong(String key, long j) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                return super.getLong(key, j);
                            }

                            @Override // X.AbstractC43131mf, X.InterfaceC32651Px
                            public final String getString(String key, String str10) {
                                o.LJIIIZ(key, "key");
                                LJIIIIZZ();
                                return super.getString(key, str10);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(delegate);
                                o.LJIIIZ(delegate, "delegate");
                                o.LJIIIZ(str8, "uid");
                                o.LJIIIZ(str9, "repoName");
                                o.LJIIIZ(c09560Zc5, "kvRepoConfig");
                                this.LIZIZ = str8;
                                this.LIZJ = c09170Xp2;
                                this.LIZLLL = str9;
                                this.LJ = i2;
                                this.LJFF = c09560Zc5;
                                this.LJI = str8.hashCode();
                                if (C19460pa.LIZ == null) {
                                    C19460pa.LIZ = UserAccountImpl.LIZIZ();
                                }
                            }
                        };
                    }

                    {
                        this.LIZ = str7;
                        this.LIZIZ = c09170Xp;
                        this.LIZJ = str;
                        this.LIZLLL = i;
                        this.LJ = c09560Zc4;
                    }
                });
            } else {
                o.LJIJI("chainProxy");
                throw null;
            }
        }
        List<? extends InterfaceC15200ii> list2 = c09560Zc4.LIZIZ;
        if (list2 != null) {
            for (InterfaceC15200ii interfaceC15200ii : list2) {
                C1UE c1ue3 = c09180Xq.LIZLLL;
                if (c1ue3 != null) {
                    c1ue3.LIZ(interfaceC15200ii);
                } else {
                    o.LJIJI("chainProxy");
                    throw null;
                }
            }
        }
        final InterfaceC16890lR interfaceC16890lR3 = c09180Xq.LIZIZ.LIZ;
        if (interfaceC16890lR3 != null) {
            C1UE c1ue4 = c09180Xq.LIZLLL;
            if (c1ue4 != null) {
                c1ue4.LIZ(new InterfaceC15200ii(interfaceC16890lR3) { // from class: X.1VB
                    public static final /* synthetic */ int LIZIZ = 0;
                    public final InterfaceC16890lR LIZ;

                    {
                        this.LIZ = interfaceC16890lR3;
                    }

                    @Override // X.InterfaceC15200ii
                    public final AbstractC43131mf LIZ(InterfaceC32651Px delegate) {
                        o.LJIIIZ(delegate, "delegate");
                        return new C22K(delegate, this.LIZ);
                    }
                });
            } else {
                o.LJIJI("chainProxy");
                throw null;
            }
        }
        if (str4 != null && (interfaceC16890lR = c09180Xq.LIZIZ.LIZ) != null) {
            C1UE c1ue5 = c09180Xq.LIZLLL;
            if (c1ue5 != null) {
                interfaceC16890lR.LJFF((InterfaceC32651Px) c1ue5.LIZ, str4);
            } else {
                o.LJIJI("chainProxy");
                throw null;
            }
        }
        C1UE c1ue6 = c09180Xq.LIZLLL;
        if (c1ue6 != null) {
            InterfaceC32651Px interfaceC32651Px4 = (InterfaceC32651Px) c1ue6.LIZ;
            LIZ.put(LIZIZ2, interfaceC32651Px4);
            return interfaceC32651Px4;
        }
        o.LJIJI("chainProxy");
        throw null;
    }
}
