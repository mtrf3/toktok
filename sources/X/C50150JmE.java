package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.BizData;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JmE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50150JmE extends AbstractC50141Jm5 {
    @Override // X.AbstractC50141Jm5
    public final InterfaceC50155JmJ LJ(ViewGroup containerView, ComponentInfo childComponentInfo) {
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(childComponentInfo, "childComponentInfo");
        return null;
    }

    @Override // X.AbstractC50141Jm5
    public final int LJFF() {
        return R.layout.cfe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r13 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50150JmE.LJII():void");
    }

    @Override // X.AbstractC50141Jm5, X.InterfaceC50155JmJ
    public final void init() {
        super.init();
        LJII();
    }

    @Override // X.AbstractC50141Jm5
    public final boolean LIZLLL(ComponentInfo componentInfo) {
        QueryCorrectComponentInfo queryCorrectComponentInfo;
        QueryCorrectComponentInfo queryCorrectComponentInfo2;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        QueryDesc LJJIJ;
        String str5;
        String str6;
        QueryDesc LJJIJ2;
        String str7;
        QueryDesc LJJIJ3;
        QueryDesc LJJIJ4;
        BizData bizData = this.LIZ.bizData;
        String str8 = null;
        if (bizData != null) {
            queryCorrectComponentInfo = bizData.queryCorrectInfo;
        } else {
            queryCorrectComponentInfo = null;
        }
        BizData bizData2 = componentInfo.bizData;
        if (bizData2 != null) {
            queryCorrectComponentInfo2 = bizData2.queryCorrectInfo;
        } else {
            queryCorrectComponentInfo2 = null;
        }
        if (queryCorrectComponentInfo2 == queryCorrectComponentInfo) {
            return false;
        }
        if (queryCorrectComponentInfo != null) {
            Integer valueOf = Integer.valueOf(queryCorrectComponentInfo.correctLevel);
            if (queryCorrectComponentInfo2 != null) {
                num = Integer.valueOf(queryCorrectComponentInfo2.correctLevel);
            } else {
                num = null;
            }
            if (valueOf.equals(num) && (str = queryCorrectComponentInfo.correctedQuery) != null) {
                if (queryCorrectComponentInfo2 != null) {
                    str2 = queryCorrectComponentInfo2.correctedQuery;
                } else {
                    str2 = null;
                }
                if (str.equals(str2) && (str3 = queryCorrectComponentInfo.originalQuery) != null) {
                    if (queryCorrectComponentInfo2 != null) {
                        str4 = queryCorrectComponentInfo2.originalQuery;
                    } else {
                        str4 = null;
                    }
                    if (str3.equals(str4) && (LJJIJ = C78857UxB.LJJIJ(queryCorrectComponentInfo, "correct")) != null && (str5 = LJJIJ.text) != null) {
                        if (queryCorrectComponentInfo2 != null && (LJJIJ4 = C78857UxB.LJJIJ(queryCorrectComponentInfo2, "correct")) != null) {
                            str6 = LJJIJ4.text;
                        } else {
                            str6 = null;
                        }
                        if (str5.equals(str6) && (LJJIJ2 = C78857UxB.LJJIJ(queryCorrectComponentInfo, "origin")) != null && (str7 = LJJIJ2.text) != null) {
                            if (queryCorrectComponentInfo2 != null && (LJJIJ3 = C78857UxB.LJJIJ(queryCorrectComponentInfo2, "origin")) != null) {
                                str8 = LJJIJ3.text;
                            }
                            if (str7.equals(str8)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // X.AbstractC50141Jm5
    public final void LJI(ComponentInfo componentInfo) {
        LJII();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50150JmE(ViewGroup parentView, ComponentInfo componentInfo) {
        super(parentView, componentInfo);
        o.LJIIIZ(componentInfo, "componentInfo");
        o.LJIIIZ(parentView, "parentView");
    }

    public final void LJIIIZ(QueryCorrectComponentInfo queryCorrectComponentInfo, String str, boolean z) {
        String str2;
        String str3;
        java.util.Map<String, String> map;
        C2U8.LIZ(new C50162JmQ(str));
        if (z) {
            str2 = "origin";
        } else {
            str2 = "correct";
        }
        QueryDesc LJJIJ = C78857UxB.LJJIJ(queryCorrectComponentInfo, str2);
        if (LJJIJ != null && (map = LJJIJ.eventParam) != null) {
            str3 = map.get("click_type");
        } else {
            str3 = null;
        }
        int i = queryCorrectComponentInfo.correctLevel;
        String str4 = queryCorrectComponentInfo.correctedQuery;
        String str5 = queryCorrectComponentInfo.originalQuery;
        if (str3 == null) {
            if (z) {
                str3 = "original_keyword";
            } else {
                str3 = "corrected_keyword";
            }
        }
        LJIIIIZZ(i, "click", str4, str5, str3);
    }

    public final void LJIIIIZZ(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        ISearchContextAbility LJJJJJ;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        if (i == 2) {
            str5 = "strong";
        } else {
            str5 = "weak";
        }
        View view = this.LIZLLL;
        if (view != null && (LJJJJJ = C17N.LJJJJJ(view)) != null && (If = LJJJJJ.If()) != null && (LIZJ = If.LIZJ()) != null) {
            str6 = LIZJ.LJLJI;
        } else {
            str6 = null;
        }
        C50168JmW c50168JmW = new C50168JmW();
        c50168JmW.LJIIZILJ("action_type", str);
        c50168JmW.LJIIZILJ("log_pb", C3A5.LIZ.LIZLLL(str6));
        c50168JmW.LJIIZILJ("correction_type", str5);
        c50168JmW.LJIIZILJ("impr_id", str6);
        c50168JmW.LJIIZILJ("corrected_keyword", str2);
        c50168JmW.LJIIZILJ("original_keyword", str3);
        c50168JmW.LJIIZILJ("click_type", str4);
        c50168JmW.LJIILIIL();
    }
}
