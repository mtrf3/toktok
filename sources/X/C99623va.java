package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99623va {
    public static InterfaceC99713vj LIZ(String conversationId, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(conversationId, "conversationId");
        final InterfaceC99713vj fakeMessageModel = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getFakeMessageModel(conversationId);
        if (fakeMessageModel == null) {
            InterfaceC99713vj.LIZ.getClass();
            fakeMessageModel = C96413qP.LIZ.LJIIZILJ(conversationId, z);
        }
        if (!z2) {
            C99033ud.Companion.getClass();
            if (!C82223Ko.LIZ(conversationId)) {
                final C99653vd c99653vd = new C99653vd(fakeMessageModel);
                fakeMessageModel = new InterfaceC99713vj(c99653vd) { // from class: X.3vZ
                    public final InterfaceC99713vj LIZIZ;

                    @Override // X.InterfaceC99713vj
                    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
                        this.LIZIZ.LIZ(interfaceC99673vf);
                    }

                    @Override // X.InterfaceC99713vj
                    public final void LIZIZ(int i) {
                        this.LIZIZ.LIZIZ(i);
                    }

                    @Override // X.InterfaceC99713vj
                    public final void LIZJ(C109544Rq msg, boolean z4, C102033zT c102033zT) {
                        o.LJIIIZ(msg, "msg");
                        this.LIZIZ.LIZJ(msg, z4, c102033zT);
                    }

                    @Override // X.InterfaceC99713vj
                    public final void LIZLLL() {
                        this.LIZIZ.LIZLLL();
                    }

                    @Override // X.InterfaceC99713vj
                    public final void LJFF() {
                        this.LIZIZ.LJFF();
                    }

                    @Override // X.InterfaceC99713vj
                    public final void LJI(InterfaceC99673vf observer) {
                        o.LJIIIZ(observer, "observer");
                        this.LIZIZ.LJI(observer);
                    }

                    @Override // X.InterfaceC99713vj
                    public final int LJII() {
                        return this.LIZIZ.LJII();
                    }

                    @Override // X.InterfaceC99713vj
                    public final String getConversationId() {
                        return this.LIZIZ.getConversationId();
                    }

                    @Override // X.InterfaceC99713vj
                    public final void refresh() {
                        this.LIZIZ.refresh();
                    }

                    @Override // X.InterfaceC99713vj
                    public final void resume() {
                        this.LIZIZ.resume();
                    }

                    @Override // X.InterfaceC99713vj
                    public final void stop() {
                        this.LIZIZ.stop();
                    }

                    @Override // X.InterfaceC99713vj
                    public final List<C109544Rq> LJ() {
                        List<C109544Rq> LJ = this.LIZIZ.LJ();
                        ArrayList arrayList = new ArrayList();
                        boolean z4 = false;
                        for (C109544Rq c109544Rq : LJ) {
                            if (z4) {
                                arrayList.add(c109544Rq);
                            } else if (c109544Rq.getMsgType() != 15) {
                                arrayList.add(c109544Rq);
                                z4 = true;
                            }
                        }
                        return arrayList;
                    }

                    {
                        this.LIZIZ = c99653vd;
                    }
                };
            }
        }
        if (!z3) {
            if (C90673h9.LIZ()) {
                C99033ud.Companion.getClass();
                if (!C82223Ko.LIZ(conversationId)) {
                    final C76172yr c76172yr = new C76172yr(conversationId);
                    fakeMessageModel = new InterfaceC99713vj(fakeMessageModel, c76172yr) { // from class: X.3vK
                        public final InterfaceC99713vj LIZIZ;
                        public final InterfaceC99483vM LIZJ;
                        public long LIZLLL;

                        @Override // X.InterfaceC99713vj
                        public final void LIZIZ(int i) {
                            this.LIZIZ.LIZIZ(i);
                        }

                        @Override // X.InterfaceC99713vj
                        public final void LIZJ(C109544Rq msg, boolean z4, C102033zT c102033zT) {
                            o.LJIIIZ(msg, "msg");
                            this.LIZIZ.LIZJ(msg, z4, c102033zT);
                        }

                        @Override // X.InterfaceC99713vj
                        public final void LJFF() {
                            this.LIZIZ.LJFF();
                        }

                        @Override // X.InterfaceC99713vj
                        public final void LJI(InterfaceC99673vf observer) {
                            o.LJIIIZ(observer, "observer");
                            this.LIZIZ.LJI(observer);
                        }

                        @Override // X.InterfaceC99713vj
                        public final int LJII() {
                            return this.LIZIZ.LJII();
                        }

                        @Override // X.InterfaceC99713vj
                        public final String getConversationId() {
                            return this.LIZIZ.getConversationId();
                        }

                        @Override // X.InterfaceC99713vj
                        public final void resume() {
                            this.LIZIZ.resume();
                        }

                        @Override // X.InterfaceC99713vj
                        public final void stop() {
                            this.LIZIZ.stop();
                        }

                        @Override // X.InterfaceC99713vj
                        public final void LIZLLL() {
                            this.LIZIZ.LIZLLL();
                            this.LIZJ.LIZIZ();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
                        @Override // X.InterfaceC99713vj
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.util.List<X.C109544Rq> LJ() {
                            /*
                                r9 = this;
                                X.3vj r0 = r9.LIZIZ
                                java.util.List r0 = r0.LJ()
                                java.util.List r4 = X.ORZ.LLJILJILJ(r0)
                                r6 = r4
                                java.util.ArrayList r6 = (java.util.ArrayList) r6
                                boolean r0 = r6.isEmpty()
                                if (r0 == 0) goto L14
                                return r4
                            L14:
                                long r0 = r9.LIZLLL
                                r7 = 0
                                r5 = 0
                                r3 = 1
                                int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                                if (r2 != 0) goto L6c
                                long r2 = java.lang.System.currentTimeMillis()
                                X.Ol8 r0 = com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig.LIZIZ
                                java.lang.Object r0 = r0.getValue()
                                com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig$Config r0 = (com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig.Config) r0
                                long r0 = r0.reportInsertPerfInterval
                                long r2 = r2 - r0
                                r9.LIZLLL = r2
                            L2f:
                                r7 = 0
                            L30:
                                X.3vM r0 = r9.LIZJ
                                java.util.List r0 = r0.LJ()
                                java.util.Iterator r3 = r0.iterator()
                            L3a:
                                boolean r0 = r3.hasNext()
                                if (r0 == 0) goto L90
                                java.lang.Object r2 = r3.next()
                                X.4Rq r2 = (X.C109544Rq) r2
                                X.Ol8 r0 = com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig.LIZIZ
                                java.lang.Object r0 = r0.getValue()
                                com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig$Config r0 = (com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig.Config) r0
                                int r1 = r0.maxSearchIndex
                                int r0 = r6.size()
                                int r0 = java.lang.Math.min(r1, r0)
                                int r1 = X.C47261Igj.LJIIIIZZ(r4, r2, r5, r0)
                                if (r1 < 0) goto L68
                            L5e:
                                int r0 = r6.size()
                                if (r1 == r0) goto L3a
                                com.bytedance.mt.protector.impl.collections.ListProtector.add(r4, r1, r2)
                                goto L3a
                            L68:
                                int r0 = -r1
                                int r1 = r0 + (-1)
                                goto L5e
                            L6c:
                                long r7 = java.lang.System.currentTimeMillis()
                                long r0 = r9.LIZLLL
                                long r7 = r7 - r0
                                X.Ol8 r0 = com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig.LIZIZ
                                java.lang.Object r0 = r0.getValue()
                                com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig$Config r0 = (com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig.Config) r0
                                long r1 = r0.reportInsertPerfInterval
                                int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                                if (r0 <= 0) goto L2f
                                r7 = 1
                                long r0 = java.lang.System.currentTimeMillis()
                                r9.LIZLLL = r0
                                X.3Ua r1 = X.C84683Ua.LJFF
                                X.3vN r0 = new X.C3UX() { // from class: X.3vN
                                    static {
                                        /*
                                            X.3vN r0 = new X.3vN
                                            r0.<init>()
                                            
                                            // error: 0x0005: SPUT (r0 I:X.3vN) X.3vN.LJ X.3vN
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C99493vN.<clinit>():void");
                                    }

                                    {
                                        /*
                                            r6 = this;
                                            java.lang.String r1 = "aweme_im_merge_message_list"
                                            r2 = 0
                                            r3 = 0
                                            X.3US r4 = X.C3US.TEA
                                            r5 = 6
                                            r0 = r6
                                            r0.<init>(r1, r2, r3, r4, r5)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C99493vN.<init>():void");
                                    }
                                }
                                r1.LIZIZ(r0, r3)
                                goto L30
                            L90:
                                if (r7 == 0) goto L99
                                X.3Ua r1 = X.C84683Ua.LJFF
                                X.3vN r0 = X.C99493vN.LJ
                                X.C1038645u.LIZ(r1, r0)
                            L99:
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C99463vK.LJ():java.util.List");
                        }

                        @Override // X.InterfaceC99713vj
                        public final void refresh() {
                            this.LIZIZ.refresh();
                            this.LIZJ.refresh();
                        }

                        @Override // X.InterfaceC99713vj
                        public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
                            this.LIZIZ.LIZ(interfaceC99673vf);
                            this.LIZJ.LIZ(interfaceC99673vf);
                        }

                        {
                            o.LJIIIZ(fakeMessageModel, "major");
                            this.LIZIZ = fakeMessageModel;
                            this.LIZJ = c76172yr;
                        }
                    };
                }
            }
            C87687YbD.LIZ.getClass();
            if (((Boolean) C87687YbD.LJIIIIZZ.getValue()).booleanValue()) {
                C99033ud.Companion.getClass();
                if (!C82223Ko.LIZ(conversationId)) {
                    fakeMessageModel = new C99453vJ(fakeMessageModel);
                }
            }
        }
        C99033ud.Companion.getClass();
        if (C82223Ko.LIZ(conversationId)) {
            fakeMessageModel = new C99873vz(fakeMessageModel);
        }
        InterfaceC99713vj c99643vc = new C99643vc(fakeMessageModel);
        c99643vc.LIZIZ(20);
        if (C115494g5.LIZ()) {
            c99643vc = new C99703vi(c99643vc);
        }
        c99643vc.refresh();
        return c99643vc;
    }
}
