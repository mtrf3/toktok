package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSenderRefactorV1Setting;
import com.google.android.play.core.assetpacks.p2;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UVX implements InterfaceC153055zZ {
    public final Object LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    public /* synthetic */ UVX(p2 p2Var, InterfaceC153055zZ interfaceC153055zZ, InterfaceC153055zZ interfaceC153055zZ2) {
        this.LJLIL = p2Var;
        this.LJLILLLLZI = interfaceC153055zZ;
        this.LJLJI = interfaceC153055zZ2;
    }

    public final void LIZ() {
        if (!LiveGiftSenderRefactorV1Setting.INSTANCE.enable()) {
            return;
        }
        C0NB.LIZIZ((String) this.LJLILLLLZI, "SendGift giftWidgetUnload");
        for (AbstractC32132CjI abstractC32132CjI : (List) this.LJLJI) {
            C0NB.LIZIZ(abstractC32132CjI.LIZIZ, "SendGift baseGiftWidgetUnLoad");
            abstractC32132CjI.LIZJ = false;
            if (abstractC32132CjI instanceof InterfaceC77299UVj) {
                UVW uvw = UVW.LJI;
                uvw.getClass();
                UVV uvv = uvw.LIZIZ;
                if (uvv != null) {
                    boolean remove = uvv.LJFF.remove(abstractC32132CjI);
                    String str = uvv.LJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("unRegLongTermInterceptor interceptor(");
                    LIZ.append(abstractC32132CjI.getClass().getName());
                    LIZ.append(") res:");
                    LIZ.append(remove);
                    C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
                } else {
                    o.LJIJI("preSendChecker");
                    throw null;
                }
            }
            if (abstractC32132CjI instanceof InterfaceC77301UVl) {
                UVW uvw2 = UVW.LJI;
                uvw2.getClass();
                UVV uvv2 = uvw2.LIZIZ;
                if (uvv2 != null) {
                    boolean remove2 = uvv2.LJI.remove(abstractC32132CjI);
                    String str2 = uvv2.LJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("unRegLongTermProcessor Processor(");
                    LIZ2.append(abstractC32132CjI.getClass().getName());
                    LIZ2.append(") res:");
                    LIZ2.append(remove2);
                    C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ2));
                } else {
                    o.LJIJI("preSendChecker");
                    throw null;
                }
            }
            if (abstractC32132CjI instanceof InterfaceC77300UVk) {
                UVW uvw3 = UVW.LJI;
                uvw3.getClass();
                C77291UVb c77291UVb = uvw3.LIZLLL;
                if (c77291UVb != null) {
                    boolean remove3 = c77291UVb.LIZ.remove(abstractC32132CjI);
                    String str3 = c77291UVb.LJII;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("unRegLongTermInterceptor interceptor(");
                    LIZ3.append(abstractC32132CjI.getClass().getName());
                    LIZ3.append(") res:");
                    LIZ3.append(remove3);
                    C0NB.LIZIZ(str3, X1D.LIZIZ(LIZ3));
                } else {
                    o.LJIJI("executorManager");
                    throw null;
                }
            }
            if (abstractC32132CjI instanceof InterfaceC77303UVn) {
                UVW uvw4 = UVW.LJI;
                uvw4.getClass();
                C77291UVb c77291UVb2 = uvw4.LIZLLL;
                if (c77291UVb2 != null) {
                    boolean remove4 = c77291UVb2.LIZIZ.remove(abstractC32132CjI);
                    String str4 = c77291UVb2.LJII;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("unRegLongTermProcessor Processor(");
                    LIZ4.append(abstractC32132CjI.getClass().getName());
                    LIZ4.append(") res:");
                    LIZ4.append(remove4);
                    C0NB.LIZIZ(str4, X1D.LIZIZ(LIZ4));
                } else {
                    o.LJIJI("executorManager");
                    throw null;
                }
            }
            if (abstractC32132CjI instanceof UVU) {
                UVW uvw5 = UVW.LJI;
                uvw5.getClass();
                UVR uvr = uvw5.LJ;
                if (uvr != null) {
                    boolean remove5 = uvr.LJFF.remove(abstractC32132CjI);
                    String str5 = uvr.LJ;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("unRegLongTermInterceptor interceptor(");
                    LIZ5.append(abstractC32132CjI.getClass().getName());
                    LIZ5.append(") res:");
                    LIZ5.append(remove5);
                    C0NB.LIZIZ(str5, X1D.LIZIZ(LIZ5));
                } else {
                    o.LJIJI("postSendChecker");
                    throw null;
                }
            }
            if (abstractC32132CjI instanceof UVM) {
                UVW uvw6 = UVW.LJI;
                uvw6.getClass();
                UVO uvo = uvw6.LJFF;
                if (uvo != null) {
                    boolean remove6 = uvo.LJ.remove(abstractC32132CjI);
                    String str6 = uvo.LIZJ;
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("unRegLongTermFailureHandler handler(");
                    LIZ6.append(abstractC32132CjI.getClass().getName());
                    LIZ6.append(") res:");
                    LIZ6.append(remove6);
                    C0NB.LIZIZ(str6, X1D.LIZIZ(LIZ6));
                } else {
                    o.LJIJI("resultManager");
                    throw null;
                }
            }
            if (abstractC32132CjI instanceof UVN) {
                UVW uvw7 = UVW.LJI;
                uvw7.getClass();
                UVO uvo2 = uvw7.LJFF;
                if (uvo2 != null) {
                    boolean remove7 = uvo2.LIZLLL.remove(abstractC32132CjI);
                    String str7 = uvo2.LIZJ;
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("unRegLongTermSuccessHandler handler(");
                    LIZ7.append(abstractC32132CjI.getClass().getName());
                    LIZ7.append(") res:");
                    LIZ7.append(remove7);
                    C0NB.LIZIZ(str7, X1D.LIZIZ(LIZ7));
                } else {
                    o.LJIJI("resultManager");
                    throw null;
                }
            }
        }
        ((List) this.LJLJI).clear();
    }

    public final void LIZIZ() {
        Aweme aweme;
        VideoBaseCell videoBaseCell;
        C2MA curFeedViewHolder = ((BaseListFragmentPanel) this.LJLIL).getCurFeedViewHolder();
        String str = null;
        if (curFeedViewHolder != null) {
            aweme = curFeedViewHolder.getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            }
        } else {
            aweme = null;
        }
        if (o.LJ(str, this.LJLILLLLZI)) {
            aweme.setSharer((User) this.LJLJI);
            C2MA curFeedViewHolder2 = ((BaseListFragmentPanel) this.LJLIL).getCurFeedViewHolder();
            if (curFeedViewHolder2 instanceof InterfaceC55219Lln) {
                ((InterfaceC55219Lln) curFeedViewHolder2).LLI().jv0(Boolean.TRUE, "show_expose_sharer_info_view");
                if ((curFeedViewHolder2 instanceof VideoBaseCell) && (videoBaseCell = (VideoBaseCell) curFeedViewHolder2) != null && videoBaseCell.LJLJJLL() == 2) {
                    VideoExposeSharerInformationVM LIZIZ = C88293dJ.LIZIZ(curFeedViewHolder2);
                    if (LIZIZ != null) {
                        LIZIZ.setState(new AqS8S0010000_3(32));
                    }
                    C221018lt.LJFF("@LinkRelation_Video", "refresh the vh!");
                }
            }
        }
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Object a;
        Context a2 = ((p2) ((InterfaceC153055zZ) this.LJLIL)).a();
        InterfaceC38408F5o LIZIZ = C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLILLLLZI);
        InterfaceC38408F5o LIZIZ2 = C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLJI);
        String str = null;
        try {
            Bundle bundle = C16880lQ.LLLLLLLLL(a2.getPackageManager(), a2.getPackageName(), 128).metaData;
            if (bundle != null) {
                str = bundle.getString("local_testing_dir");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str == null) {
            a = LIZIZ.a();
        } else {
            a = LIZIZ2.a();
        }
        C40654FxS.LJI(a);
        return a;
    }

    public /* synthetic */ UVX(C32111Cix c32111Cix) {
        this.LJLIL = c32111Cix;
        this.LJLILLLLZI = "GiftSenderComponentManager";
        this.LJLJI = new ArrayList();
    }

    public /* synthetic */ UVX(BaseListFragmentPanel panel, String aid, User user) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(aid, "aid");
        this.LJLIL = panel;
        this.LJLILLLLZI = aid;
        this.LJLJI = user;
    }

    public /* synthetic */ UVX(C47663InD c47663InD, C64702gM c64702gM, C62586OhK c62586OhK) {
        this.LJLIL = c47663InD;
        this.LJLILLLLZI = c64702gM;
        this.LJLJI = c62586OhK;
    }
}
