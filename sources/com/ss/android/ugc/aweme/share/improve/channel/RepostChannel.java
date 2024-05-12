package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC13940gg;
import X.AbstractC62625Ohx;
import X.C109304Qs;
import X.C12460eI;
import X.C221108m2;
import X.C227768wm;
import X.C29701Eo;
import X.C62822Ol8;
import X.C77870UhG;
import X.FMX;
import X.InterfaceC109364Qy;
import X.InterfaceC62573Oh7;
import X.ORZ;
import X.OSZ;
import Y.IDObjectS1S0101000_1;
import Y.IDObjectS326S0100000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.channel.RepostChannel;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RepostChannel extends PureLogicChannel {
    public final Aweme LJLIL;
    public final Context LJLILLLLZI;
    public final Bundle LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        return null;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "repost";
    }

    public final int LJIJI() {
        String aid = this.LJLIL.getAid();
        if (aid == null) {
            return 1;
        }
        return LJIJJ().LJIIIZ(aid);
    }

    public final InterfaceC109364Qy LJIJJ() {
        return (InterfaceC109364Qy) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final boolean LJIILJJIL() {
        if (LJIJI() == 1 || LJIJI() == 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        int LIZLLL;
        if (LJIJI() == 0 || LJIJI() == 1) {
            LIZLLL = LJIJJ().LIZLLL();
        } else {
            LIZLLL = LJIJJ().LJI();
        }
        String string = this.LJLILLLLZI.getString(LIZLLL);
        o.LJIIIIZZ(string, "context.getString(stringRes)");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJFF(View itemView) {
        ViewGroup viewGroup;
        o.LJIIIZ(itemView, "itemView");
        if ((itemView instanceof ViewGroup) && (viewGroup = (ViewGroup) itemView) != null) {
            IDObjectS326S0100000_1 iDObjectS326S0100000_1 = new IDObjectS326S0100000_1(viewGroup, 10);
            ArrayList arrayList = new ArrayList();
            Iterator it = iDObjectS326S0100000_1.iterator();
            while (true) {
                IDObjectS1S0101000_1 iDObjectS1S0101000_1 = (IDObjectS1S0101000_1) it;
                if (!iDObjectS1S0101000_1.hasNext()) {
                    break;
                }
                Object next = iDObjectS1S0101000_1.next();
                if (next instanceof C77870UhG) {
                    arrayList.add(next);
                }
            }
            C29701Eo c29701Eo = (C29701Eo) ORZ.LJLLLLLL(0, arrayList);
            if (c29701Eo == null) {
                return;
            }
            C12460eI.LIZIZ(c29701Eo, new AbstractC13940gg(this) { // from class: X.4R1
                public InterfaceC65784Pro<String> LJ;
                public final C109374Qz LJFF;

                @Override // X.AbstractC13940gg
                public final int LIZIZ() {
                    return 0;
                }

                @Override // X.AbstractC13940gg
                public final boolean LJI() {
                    return false;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                    return this.LJFF;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [X.4Qz] */
                {
                    this.LJ = new AqS151S0100000_1(this, 965);
                    this.LJFF = new InterfaceC19530ph() { // from class: X.4Qz
                        @Override // X.InterfaceC19530ph
                        public final void LIZ(View view, String itemID) {
                            o.LJIIIZ(itemID, "itemID");
                            if (o.LJ(itemID, String.valueOf(RepostChannel.this.hashCode()))) {
                                InterfaceC109364Qy LIZLLL = C7HV.LIZIZ.LIZLLL();
                                String aid = RepostChannel.this.LJLIL.getAid();
                                o.LJIIIIZZ(aid, "aweme.aid");
                                String string = RepostChannel.this.LJLJI.getString("event_type", "");
                                o.LJIIIIZZ(string, "extras.getString(Mob.Key.EVENT_TYPE, \"\")");
                                LIZLLL.LJIIJ(aid, string);
                            }
                        }
                    };
                }

                @Override // X.AbstractC13940gg
                public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                    this.LJ = interfaceC65784Pro;
                }
            });
            if (LJIJI() == 0 || LJIJI() == 1) {
                c29701Eo.setAnimation(LJIJJ().LJIIIIZZ());
                if (LJIJJ().LJIILIIL()) {
                    return;
                }
                c29701Eo.setRepeatCount(LJIJJ().LJ());
                c29701Eo.playAnimation();
                LJIJJ().LJFF();
                return;
            }
            c29701Eo.setImageResource(LJIJJ().LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJIIJJI(int i) {
        int i2;
        if (!this.LJLJJI) {
            String aid = this.LJLIL.getAid();
            if (aid != null && (LJIJI() == 0 || LJIJI() == 2)) {
                OSZ[] oszArr = new OSZ[4];
                oszArr[0] = new OSZ(this.LJLJI.getString("event_type", ""), "enter_from");
                if (LJIJI() == 0) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                oszArr[1] = new OSZ(Integer.valueOf(i2), "reposted");
                oszArr[2] = new OSZ(aid, "group_id");
                oszArr[3] = new OSZ(this.LJLJI.getString("panel_source", ""), "panel_source");
                FMX.LJIILL("repost_button_show", oszArr);
            }
            this.LJLJJI = true;
        }
    }

    public RepostChannel(Context context, Bundle extras, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extras, "extras");
        this.LJLIL = aweme;
        this.LJLILLLLZI = context;
        this.LJLJI = extras;
        this.LJLJJL = C221108m2.LIZIZ(C109304Qs.LJLIL);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        String aid = this.LJLIL.getAid();
        if (aid == null) {
            return false;
        }
        String string = this.LJLJI.getString("event_type", "");
        String authorUid = this.LJLIL.getAuthorUid();
        String LJIIIIZZ = C227768wm.LJIIIIZZ(this.LJLIL);
        String string2 = this.LJLJI.getString("panel_source", "");
        o.LJIIIIZZ(string, "getString(Mob.Key.EVENT_TYPE, \"\")");
        o.LJIIIIZZ(authorUid, "authorUid");
        o.LJIIIIZZ(LJIIIIZZ, "getFollowStatus(aweme)");
        o.LJIIIIZZ(string2, "getString(Mob.Key.PANEL_SOURCE, \"\")");
        LJIJJ().LJIIL(aid, new UpvotePublishMobParam(string, null, aid, authorUid, LJIIIIZZ, null, null, string2, false, null, 3554), null);
        return true;
    }
}
