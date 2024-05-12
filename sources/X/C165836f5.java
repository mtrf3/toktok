package X;

import fjb.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS4S1301000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startFileVoiceChange$1$1", f = "VoiceChanger.kt", l = {121}, m = "invokeSuspend")
/* renamed from: X.6f5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165836f5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C165866f8 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C166866gk LJLJJI;
    public final /* synthetic */ InterfaceC166046fQ LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165836f5(C165866f8 c165866f8, String str, C166866gk c166866gk, InterfaceC166046fQ interfaceC166046fQ, int i, InterfaceC67352kd<? super C165836f5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c165866f8;
        this.LJLJI = str;
        this.LJLJJI = c166866gk;
        this.LJLJJL = interfaceC166046fQ;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165836f5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C165966fI c165966fI = (C165966fI) this.LJLILLLLZI.LJFF.getValue();
            final C165866f8 c165866f8 = this.LJLILLLLZI;
            final String str = this.LJLJI;
            final C166866gk c166866gk = this.LJLJJI;
            final InterfaceC166046fQ interfaceC166046fQ = this.LJLJJL;
            final int i2 = this.LJLJJLL;
            InterfaceC166346fu<C166396fz> interfaceC166346fu = new InterfaceC166346fu<C166396fz>() { // from class: X.6fZ
                @Override // X.InterfaceC166346fu
                public final void LIZ(C166276fn executeResult, C166396fz c166396fz) {
                    int i3;
                    int i4;
                    C166396fz c166396fz2 = c166396fz;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (o.LJ(C165866f8.this.LJ.get(str), Boolean.TRUE)) {
                        int i5 = executeResult.LIZ;
                        if (i5 == 2) {
                            C166146fa.LIZ(-2, "pipeline_state_code");
                            C166146fa.LIZIZ(c166396fz2.LIZ.LIZLLL, "total_duration");
                            C166146fa.LJFF();
                        } else if (i5 == 1) {
                            C166146fa.LIZ(executeResult.LIZJ, "pipeline_error_stage");
                            long j = c166396fz2.LIZ.LJI;
                            C166386fy c166386fy = c166396fz2.LJIIJ;
                            double d = c166386fy.LIZJ;
                            int i6 = c166386fy.LIZLLL;
                            if (c166386fy.LJ) {
                                if (c166386fy.LJFF) {
                                    i3 = 3;
                                } else {
                                    i3 = 1;
                                }
                            } else if (c166386fy.LJFF) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            C166146fa.LJ(executeResult.LIZJ, j, d, i6, i3, c166386fy.LJI, c166386fy.LJII, c166386fy.LJIIIZ, c166386fy.LJIIIIZZ);
                        }
                        if (executeResult.LIZ == 2) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("curHandlerName", executeResult.LIZIZ);
                            linkedHashMap.put("curHandlerId", String.valueOf(executeResult.LIZJ));
                            Integer num = (Integer) ((LinkedHashMap) C67692lB.LIZ).get(Integer.valueOf(executeResult.LIZJ));
                            if (num != null) {
                                i4 = num.intValue();
                            } else {
                                i4 = -1;
                            }
                            C2VQ.LIZIZ(new AqS4S1301000_2(c166866gk, interfaceC166046fQ, str, i2, new C59722Wa(linkedHashMap, i4, c166396fz2.LJFF), 0), 0L);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x013b A[EDGE_INSN: B:19:0x013b->B:17:0x013b BREAK  A[LOOP:0: B:11:0x011c->B:18:?], SYNTHETIC] */
                @Override // X.InterfaceC166346fu
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(X.C166276fn r13, X.C166396fz r14) {
                    /*
                        Method dump skipped, instructions count: 322
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C166136fZ.LIZIZ(X.6fn, X.6fo):void");
                }

                @Override // X.InterfaceC166346fu
                public final void LIZJ(C166276fn executeResult, C166396fz c166396fz) {
                    int i3;
                    C166396fz c166396fz2 = c166396fz;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (o.LJ(C165866f8.this.LJ.get(str), Boolean.TRUE)) {
                        int i4 = executeResult.LIZ;
                        if (i4 == 2) {
                            C166146fa.LIZ(0, "pipeline_state_code");
                            C166146fa.LIZIZ(c166396fz2.LIZ.LIZLLL, "total_duration");
                            C166146fa.LJFF();
                        } else if (i4 == 1) {
                            long j = c166396fz2.LIZ.LJI;
                            C166386fy c166386fy = c166396fz2.LJIIJ;
                            double d = c166386fy.LIZJ;
                            int i5 = c166386fy.LIZLLL;
                            if (c166386fy.LJ) {
                                if (c166386fy.LJFF) {
                                    i3 = 3;
                                } else {
                                    i3 = 1;
                                }
                            } else if (c166386fy.LJFF) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            C166146fa.LJ(executeResult.LIZJ, j, d, i5, i3, c166386fy.LJI, c166386fy.LJII, "", null);
                        }
                        if (executeResult.LIZ == 2) {
                            List<C166116fX> list = c166396fz2.LJFF;
                            if (list != null) {
                                C166866gk c166866gk2 = c166866gk;
                                C2VQ.LIZIZ(new AqS4S1301000_2(i2, interfaceC166046fQ, c166866gk2, str, list, 1), 0L);
                                return;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
            };
            this.LJLIL = 1;
            if (c165966fI.LIZIZ(c165966fI.LIZLLL(), interfaceC166346fu, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
