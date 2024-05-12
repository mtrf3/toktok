package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.465, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass465 extends AnonymousClass460<SayHelloContent> implements C3WY {
    public static final /* synthetic */ int LLIILZL = 0;
    public final View LLIIIL;
    public final boolean LLIIIZ;
    public final InterfaceC65784Pro<C76800UCe> LLIIJI;
    public final String LLIIJLIL;
    public final /* synthetic */ C3WQ LLIIL;
    public C4MP LLIILII;

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LLIIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LLIIL.LLJILLL(c3wr);
    }

    public final void s0() {
        this.LLIIL.LIZ();
    }

    public final void dismiss() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setVisibility(8);
        s0();
    }

    public final void v0(String str) {
        C4MP c4mp = this.LLIILII;
        if (c4mp != null && (c4mp instanceof C4MR)) {
            TextView textView = c4mp.LJII;
            if (textView != null) {
                textView.setText(str);
            } else {
                o.LJIJI("sayHelloTv");
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass460
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, SayHelloContent sayHelloContent, int i) {
        C4MP c4mp;
        o.LJIIIZ(msg, "msg");
        if (sayHelloContent == null || !this.LLIIIZ) {
            C26338AVi.LJIIIZ(this.LLIIIL, 0, 0, 0, 0, 16);
            this.LLIIIL.setVisibility(8);
            return;
        }
        if (sayHelloContent.isNewStyle()) {
            C4MP c4mp2 = this.LLIILII;
            if (!(c4mp2 instanceof C4MQ)) {
                if (c4mp2 != null) {
                    c4mp2.LIZJ(false);
                }
                this.LLIILII = new C4MP(this) { // from class: X.4MQ
                    public RecyclerView LJIIJ;
                    public C4MS LJIIJJI;

                    @Override // X.C4MP
                    public final List<Emoji> LJ() {
                        List<Emoji> emojiList;
                        SayHelloContent sayHelloContent2 = this.LJ;
                        if (sayHelloContent2 == null || (emojiList = sayHelloContent2.getEmojiList()) == null) {
                            return C61878OQg.INSTANCE;
                        }
                        return emojiList;
                    }

                    @Override // X.C4MP
                    public final void LJI() {
                        super.LJI();
                        this.LJIIJ = (RecyclerView) LIZLLL(R.id.j9y);
                        C4MS c4ms = new C4MS();
                        this.LJIIJJI = c4ms;
                        c4ms.LJLILLLLZI = new AqS183S0100000_1(this, 77);
                        RecyclerView recyclerView = this.LJIIJ;
                        if (recyclerView != null) {
                            C4MS c4ms2 = this.LJIIJJI;
                            if (c4ms2 != null) {
                                recyclerView.setAdapter(c4ms2);
                                RecyclerView recyclerView2 = this.LJIIJ;
                                if (recyclerView2 != null) {
                                    recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
                                    return;
                                } else {
                                    o.LJIJI("recyclerView");
                                    throw null;
                                }
                            }
                            o.LJIJI("adapter");
                            throw null;
                        }
                        o.LJIJI("recyclerView");
                        throw null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this);
                        o.LJIIIZ(this, "parent");
                    }

                    @Override // X.C4MP
                    public final void LIZJ(boolean z) {
                        int i2;
                        RecyclerView recyclerView = this.LJIIJ;
                        if (recyclerView != null) {
                            if (z) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            recyclerView.setVisibility(i2);
                            return;
                        }
                        o.LJIJI("recyclerView");
                        throw null;
                    }

                    @Override // X.C4MP
                    public final void LIZ(C109544Rq msg2, C109544Rq c109544Rq2, SayHelloContent content, int i2, boolean z, String str) {
                        o.LJIIIZ(msg2, "msg");
                        o.LJIIIZ(content, "content");
                        super.LIZ(msg2, c109544Rq2, content, i2, z, str);
                        LIZJ(true);
                        C4MS c4ms = this.LJIIJJI;
                        if (c4ms != null) {
                            c4ms.LJJIIJ(LJ(), null);
                        } else {
                            o.LJIJI("adapter");
                            throw null;
                        }
                    }
                };
            }
        } else {
            C4MP c4mp3 = this.LLIILII;
            if (!(c4mp3 instanceof C4MR)) {
                if (c4mp3 != null) {
                    c4mp3.LIZJ(false);
                }
                this.LLIILII = new C4MR(this, this.LLIIJI);
            }
        }
        if (this.LLIIIZ) {
            C26338AVi.LJI(this.LLIIIL, 0, 0, 0, 0, false, 16);
        }
        if (sayHelloContent != null && (c4mp = this.LLIILII) != null) {
            c4mp.LIZ(msg, c109544Rq, sayHelloContent, i, this.LLIIIZ, this.LLIIJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass465(View rootLayout, EnumC110124Tw type, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str) {
        super(rootLayout, type);
        o.LJIIIZ(rootLayout, "rootLayout");
        o.LJIIIZ(type, "type");
        this.LLIIIL = rootLayout;
        this.LLIIIZ = z;
        this.LLIIJI = interfaceC65784Pro;
        this.LLIIJLIL = str;
        this.LLIIL = new C3WQ();
    }
}
