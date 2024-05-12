package com.ss.android.ugc.aweme.im.sdk.relations.ui.view;

import X.C1040846q;
import X.C1041346v;
import X.C107724Kq;
import X.C112244aq;
import X.C116144h8;
import X.C119354mJ;
import X.C16880lQ;
import X.C32151Nz;
import X.C43659HBn;
import X.C48709J9t;
import X.C4M4;
import X.C53341Kwb;
import X.C56331M8x;
import X.C77357UXp;
import X.C78897Uxp;
import X.C78939UyV;
import X.C78946Uyc;
import X.C7MY;
import X.C90193gN;
import X.C96933rF;
import X.EnumC112364b2;
import X.EnumC62195Ob1;
import X.InterfaceC1041146t;
import X.W5F;
import X.W5U;
import Y.ACListenerS36S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InboxHorizontalFriendCell extends PowerCell<C116144h8> {
    public static final int LJLJJL;
    public static final int LJLJJLL;
    public static final Set<InboxHorizontalFriendCell> LJLJL;
    public SmartAvatarImageView LJLIL;
    public TextView LJLILLLLZI;
    public C119354mJ LJLJI;
    public C4M4 LJLJJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String str;
        IMUser iMUser;
        super.onViewAttachedToWindow();
        LJLJL.add(this);
        C116144h8 item = getItem();
        if (item != null && item.LJLILLLLZI) {
            C116144h8 item2 = getItem();
            if (item2 != null && (iMUser = item2.LJLIL) != null) {
                str = iMUser.getUid();
            } else {
                str = null;
            }
            C77357UXp.LJJIJIIJIL(this, "activity_status", str, 2, null, null, 114);
            L();
        }
    }

    static {
        int i;
        int i2;
        boolean z = C48709J9t.LIZ;
        if (z) {
            i = 88;
        } else {
            i = 80;
        }
        LJLJJL = i;
        if (z) {
            i2 = 122;
        } else {
            i2 = 114;
        }
        LJLJJLL = i2;
        LJLJL = new LinkedHashSet();
    }

    public final void L() {
        String str;
        IMUser iMUser;
        C107724Kq c107724Kq = new C107724Kq(getCurrentLifeCycleOwner());
        C116144h8 item = getItem();
        if (item == null || (iMUser = item.LJLIL) == null || (str = iMUser.getUid()) == null) {
            str = "";
        }
        c107724Kq.LIZJ = str;
        c107724Kq.LIZIZ = EnumC112364b2.INBOX_TOP;
        c107724Kq.LJI = Boolean.TRUE;
        c107724Kq.LJFF = Integer.valueOf(C77357UXp.LJIJJLI(this) - 1);
        C78946Uyc.LJJIJL(c107724Kq);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        if (C48709J9t.LIZ) {
            return R.layout.b7f;
        }
        return R.layout.b7g;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C4M4 c4m4 = this.LJLJJI;
        if (c4m4 != null) {
            c4m4.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        LJLJL.remove(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        this.LJLIL = (SmartAvatarImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name_tv)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.status_view)");
        this.LJLJI = (C119354mJ) findViewById3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        LJLJL.remove(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C116144h8 c116144h8) {
        boolean z;
        C116144h8 t = c116144h8;
        o.LJIIIZ(t, "t");
        if (t.LJLILLLLZI) {
            this.itemView.setVisibility(0);
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C7MY.LIZIZ(LJLJJL);
                layoutParams.height = C7MY.LIZIZ(LJLJJLL);
                itemView.setLayoutParams(layoutParams);
                if ((C1041346v.LIZIZ() & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.LJLJJI == null) {
                        InterfaceC1041146t.LIZ.getClass();
                        C96933rF c96933rF = C96933rF.LIZIZ;
                        SmartAvatarImageView smartAvatarImageView = this.LJLIL;
                        if (smartAvatarImageView != null) {
                            this.LJLJJI = c96933rF.LIZIZ(smartAvatarImageView, "skylight");
                        } else {
                            o.LJIJI("avatarView");
                            throw null;
                        }
                    }
                    C4M4 c4m4 = this.LJLJJI;
                    if (c4m4 != null) {
                        String uid = t.LJLIL.getUid();
                        o.LJIIIIZZ(uid, "t.contact.uid");
                        C1040846q.LIZIZ(c4m4, uid, t.LJLIL.getDisplayAvatar(), 0, 12);
                    } else {
                        o.LJIJI("avatarLoader");
                        throw null;
                    }
                } else {
                    W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLIL.getDisplayAvatar()));
                    LJII.LJIILL = R.drawable.b0p;
                    LJII.LJJIII = EnumC62195Ob1.SMALL;
                    SmartAvatarImageView smartAvatarImageView2 = this.LJLIL;
                    if (smartAvatarImageView2 != null) {
                        LJII.LJJIIJ = smartAvatarImageView2;
                        C43659HBn.LJIIZILJ(LJII, "InboxHorizontalFriendCell", t.LJLIL.getUid(), 0, null, 28);
                    } else {
                        o.LJIJI("avatarView");
                        throw null;
                    }
                }
                if (LJLJL.contains(this)) {
                    this.itemView.postDelayed(new ARunnableS37S0100000_1(this, 139), 200L);
                }
                String LIZJ = C56331M8x.LIZJ(t.LJLIL.getNickName(), t.LJLIL.getUniqueId(), false, false);
                TextView textView = this.LJLILLLLZI;
                if (textView != null) {
                    textView.setText(LIZJ);
                    C16880lQ.LJIIJ(new ACListenerS36S0200000_1(t, this, 77), this.itemView);
                    if (C53341Kwb.LIZ()) {
                        SmartAvatarImageView smartAvatarImageView3 = this.LJLIL;
                        if (smartAvatarImageView3 != null) {
                            C78897Uxp.LJJJJL(smartAvatarImageView3, C32151Nz.LJIIZILJ(32));
                        } else {
                            o.LJIJI("avatarView");
                            throw null;
                        }
                    }
                    C119354mJ c119354mJ = this.LJLJI;
                    if (c119354mJ != null) {
                        c119354mJ.setActive(true);
                        C119354mJ c119354mJ2 = this.LJLJI;
                        if (c119354mJ2 != null) {
                            c119354mJ2.LIZ(R.attr.cl);
                            if (C90193gN.LIZ()) {
                                C119354mJ c119354mJ3 = this.LJLJI;
                                if (c119354mJ3 != null) {
                                    c119354mJ3.setTranslationX(-4.0f);
                                } else {
                                    o.LJIJI("statusView");
                                    throw null;
                                }
                            } else {
                                C119354mJ c119354mJ4 = this.LJLJI;
                                if (c119354mJ4 != null) {
                                    c119354mJ4.setTranslationX(4.0f);
                                } else {
                                    o.LJIJI("statusView");
                                    throw null;
                                }
                            }
                            View view = this.itemView;
                            o.LJIIIIZZ(view, "this.itemView");
                            C112244aq.LIZ(view, t.LJLIL.getUid(), Boolean.TRUE);
                            return;
                        }
                        o.LJIJI("statusView");
                        throw null;
                    }
                    o.LJIJI("statusView");
                    throw null;
                }
                o.LJIJI("userName");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        this.itemView.setVisibility(8);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        ViewGroup.LayoutParams layoutParams2 = itemView2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = 0;
            layoutParams2.height = 0;
            itemView2.setLayoutParams(layoutParams2);
            View view2 = this.itemView;
            o.LJIIIIZZ(view2, "this.itemView");
            view2.setTag(R.id.eg1, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
