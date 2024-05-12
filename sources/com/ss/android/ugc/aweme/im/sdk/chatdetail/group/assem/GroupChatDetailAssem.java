package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.assem;

import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C90723hE;
import X.C90803hM;
import X.C90813hN;
import X.C94443nE;
import X.C95103oI;
import X.C95113oJ;
import X.C95173oP;
import X.C95393ol;
import X.C95493ov;
import X.C95573p3;
import X.C95683pE;
import X.C95733pJ;
import X.C9BD;
import X.EnumC95523oy;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.SIT;
import X.SYL;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.common.DividerCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.common.GroupDetailSeeMoreFooter;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.header.GroupTitleCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member.InviteMemberCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member.MemberCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member.MemberListVM;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.request.GroupDetailRequestCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.request.GroupDetailRequestListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS120S0300000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatDetailAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;
    public SYL LJLJJLL;

    public GroupChatDetailAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C95573p3.class, "GroupDetailData"), checkSupervisorPrepared());
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C95683pE.class, "GroupDetailDataSource"), checkSupervisorPrepared());
        C9BD c9bd = C9BD.LIZ;
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 452);
        C65776Prg LIZ = C65352Pkq.LIZ(GroupDetailViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9bd, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 455), C95113oJ.INSTANCE, aqS151S0100000_1);
        AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1(this, 453);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MemberListVM.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 456), C95103oI.INSTANCE, aqS151S0100000_12);
        AqS151S0100000_1 aqS151S0100000_13 = new AqS151S0100000_1(this, 454);
        C65776Prg LIZ3 = C65352Pkq.LIZ(GroupDetailRequestListVM.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ3, c9bd, new AqS151S0100000_1((InterfaceC65350Pko) LIZ3, 457), C95173oP.INSTANCE, aqS151S0100000_13);
    }

    public final GroupDetailViewModel v3() {
        return (GroupDetailViewModel) this.LJLJI.getValue();
    }

    public final void A3(EnumC95523oy type) {
        Object obj;
        SYL syl = this.LJLJJLL;
        if (syl != null) {
            List<SIT> allChunks = syl.getAllChunks();
            o.LJIIIIZZ(allChunks, "list.allChunks");
            for (SIT sit : allChunks) {
                if (sit instanceof C95393ol) {
                    o.LJIIIZ(sit, "<this>");
                    o.LJIIIZ(type, "type");
                    Iterator it = ((ArrayList) sit.LJLJJL.LJII()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) obj;
                            if ((interfaceC57784Mm4 instanceof C95493ov) && ((C95493ov) interfaceC57784Mm4).LJLIL == type) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) obj;
                    if ((interfaceC57784Mm42 instanceof C95493ov) && interfaceC57784Mm42 != null) {
                        sit.LJLJJL.LJIILL(sit.LJLJJL.LJIIIZ(interfaceC57784Mm42), interfaceC57784Mm42);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SYL syl;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof SYL) || (syl = (SYL) view) == null) {
            return;
        }
        this.LJLJJLL = syl;
        syl.setItemAnimator(null);
        GroupDetailViewModel v3 = v3();
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLZ;
            }
        }, null, new AqS183S0100000_1(this, 58), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 62), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLJL;
            }
        }, null, C90723hE.LJLIL, 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLLLLLL;
            }
        }, null, C95733pJ.LJLIL, 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C95293ob) obj).LJLILLLLZI);
            }
        }, null, new AqS164S0200000_1(v3, this, 13), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C95293ob) obj).LJLJI);
            }
        }, null, new AqS183S0100000_1(this, 63), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C95293ob) obj).LJLJJI);
            }
        }, null, new AqS183S0100000_1(this, 52), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLJLLL;
            }
        }, null, new AqS183S0100000_1(this, 53), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLJJL;
            }
        }, null, new AqS183S0100000_1(this, 54), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLL;
            }
        }, null, C90803hM.LJLIL, 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3og
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJZ;
            }
        }, null, C90813hN.LJLIL, 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3od
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLJLJ;
            }
        }, null, new AqS183S0100000_1(this, 55), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLLL;
            }
        }, null, new AqS183S0100000_1(this, 56), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLLI;
            }
        }, null, new AqS183S0100000_1(this, 57), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLLJ;
            }
        }, null, new AqS183S0100000_1(this, 59), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3oj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLLILLLL;
            }
        }, null, new AqS183S0100000_1(this, 60), 6);
        C8YN.LJII(this, v3, new TBT() { // from class: X.3of
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJLJJLL;
            }
        }, null, new AqS183S0100000_1(this, 61), 6);
        SYL syl2 = this.LJLJJLL;
        if (syl2 != null) {
            final LifecycleRegistry lifecycle = getLifecycle();
            C94443nE c94443nE = new C94443nE(lifecycle) { // from class: X.3oK
                @Override // X.SIT, X.InterfaceC227608wW
                public final void onCreate() {
                    LJIIIIZZ(GroupTitleCell.class);
                    this.LJLJJL.LJIILLIIL(C47261Igj.LJJIJ(new C95233oV(LJIIJ().getState().LJLIL)));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(lifecycle);
                    o.LJIIIZ(lifecycle, "lc");
                }
            };
            x3(c94443nE);
            syl2.LLLF.LLD(c94443nE);
            C95393ol c95393ol = new C95393ol(getLifecycle());
            x3(c95393ol);
            syl2.LLLF.LLD(c95393ol);
            final LifecycleRegistry lifecycle2 = getLifecycle();
            C94443nE c94443nE2 = new C94443nE(lifecycle2) { // from class: X.3pA
                @Override // X.SIT, X.InterfaceC227608wW
                public final void onCreate() {
                    String str;
                    LJIIIIZZ(GroupDetailRequestCell.class, GroupDetailSeeMoreFooter.class);
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJI), R.layout.b9p, null, false);
                    TextView textView = (TextView) LLLLIILL.findViewById(R.id.efo);
                    Context context = this.LJLJI;
                    if (context != null) {
                        str = context.getString(R.string.guz);
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                    GroupDetailRequestListVM groupDetailRequestListVM = this.LJLL;
                    if (groupDetailRequestListVM != null) {
                        groupDetailRequestListVM.LJLJJI = this.LJLJJL;
                        C8YN.LJII(this, groupDetailRequestListVM, new TBT() { // from class: X.3pB
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C95663pC) obj).LJLIL;
                            }
                        }, null, new AqS164S0200000_1(this, LLLLIILL, 20), 6);
                        GroupDetailRequestListVM groupDetailRequestListVM2 = this.LJLL;
                        if (groupDetailRequestListVM2 != null) {
                            groupDetailRequestListVM2.refresh();
                            return;
                        } else {
                            o.LJIJI("requestsViewModel");
                            throw null;
                        }
                    }
                    o.LJIJI("requestsViewModel");
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(lifecycle2);
                    o.LJIIIZ(lifecycle2, "lc");
                }
            };
            x3(c94443nE2);
            syl2.LLLF.LLD(c94443nE2);
            final LifecycleRegistry lifecycle3 = getLifecycle();
            C94443nE c94443nE3 = new C94443nE(lifecycle3) { // from class: X.3nN
                @Override // X.SIT, X.InterfaceC227608wW
                public final void onCreate() {
                    int i;
                    LJIIIIZZ(MemberCell.class, InviteMemberCell.class, DividerCell.class, GroupDetailSeeMoreFooter.class);
                    Context context = this.LJLJI;
                    if (context == null) {
                        return;
                    }
                    C95573p3 c95573p3 = this.LJLJL;
                    if (c95573p3 != null) {
                        AbstractC90763hI abstractC90763hI = c95573p3.LJLILLLLZI;
                        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.b9p, null, false);
                        TextView textView = (TextView) LLLLIILL.findViewById(R.id.efo);
                        String string = context.getString(R.string.gxy);
                        o.LJIIIIZZ(string, "context.getString(R.stri…roup_chat_members_number)");
                        Object[] objArr = new Object[1];
                        C63120Opw LIZLLL = abstractC90763hI.LIZLLL();
                        if (LIZLLL != null) {
                            i = LIZLLL.getMemberCount();
                        } else {
                            i = 1;
                        }
                        objArr[0] = Integer.valueOf(i);
                        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(objArr, 1));
                        o.LJIIIIZZ(LLLZ, "format(format, *args)");
                        textView.setText(LLLZ);
                        LIZIZ(0, LLLLIILL);
                        LJIIJJI().LJLJJI = this.LJLJJL;
                        C8YN.LJII(this, LJIIJJI(), new TBT() { // from class: X.3nO
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C94453nF) obj).LJLILLLLZI;
                            }
                        }, null, new AqS120S0300000_1(LLLLIILL, context, abstractC90763hI, 3), 6);
                        C8YN.LJII(this, LJIIJ(), new TBT() { // from class: X.3nP
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C95293ob) obj).LJZL;
                            }
                        }, null, new AqS183S0100000_1(this, 89), 6);
                        C8YN.LJII(this, LJIIJJI(), new TBT() { // from class: X.3nL
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C94453nF) obj).LJLJJI;
                            }
                        }, null, new AqS183S0100000_1(this, 90), 6);
                        if (abstractC90763hI.LIZLLL() == null) {
                            C8YN.LJII(this, LJIIJ(), new TBT() { // from class: X.3nQ
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C95293ob) obj).LL;
                                }
                            }, null, new AqS164S0200000_1(context, LLLLIILL, 18), 6);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("detailData");
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(lifecycle3);
                    o.LJIIIZ(lifecycle3, "lc");
                }
            };
            x3(c94443nE3);
            syl2.LLLF.LLD(c94443nE3);
            return;
        }
        o.LJIJI("list");
        throw null;
    }

    public final void x3(C94443nE c94443nE) {
        c94443nE.LJLJLLL = (MemberListVM) this.LJLJJI.getValue();
        GroupDetailViewModel v3 = v3();
        o.LJIIIZ(v3, "<set-?>");
        c94443nE.LJLJLJ = v3;
        c94443nE.LJLL = (GroupDetailRequestListVM) this.LJLJJL.getValue();
        C95573p3 c95573p3 = (C95573p3) this.LJLIL.getValue();
        o.LJIIIZ(c95573p3, "<set-?>");
        c94443nE.LJLJL = c95573p3;
    }
}
