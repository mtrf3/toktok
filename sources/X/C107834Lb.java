package X;

import Y.ALAdapterS0S0300000_1;
import Y.ARunnableS37S0100000_1;
import android.util.JsonReader;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS47S0400000_1;
import kotlin.jvm.internal.AqS90S0300000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107834Lb {
    public final AbstractC1029742j LIZ;
    public final ChatRoomViewModel LIZIZ;
    public final InterfaceC65784Pro<Integer> LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final C107844Lc LJFF;
    public final C62822Ol8 LJI;
    public OSJ<? extends RecyclerView.ViewHolder, ? extends C29701Eo, ? extends ConstraintLayout> LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final List<InterfaceC65350Pko<? extends AbstractC89473fD>> LJIIJJI;
    public final ARunnableS37S0100000_1 LJIIL;
    public final C107854Ld LJIILIIL;

    public C107834Lb() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        C34B.LIZIZ("SwipeForReplyIntroductionHelper", "enter chat room");
        C107964Lo c107964Lo = new C107964Lo((Forest) C108044Lw.LIZLLL.getValue());
        C34B c34b = C34B.LIZ;
        C107864Le c107864Le = new C107864Le(c34b);
        C107874Lf c107874Lf = new C107874Lf(c34b);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("forceUpdateResource -> ");
        C62822Ol8 c62822Ol8 = C108044Lw.LIZJ;
        LIZ.append((String) c62822Ol8.getValue());
        c107864Le.invoke("SwipeForReplyIntroductionAnimationResourceMgr", X1D.LIZIZ(LIZ));
        Object value = c62822Ol8.getValue();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setDisableBuiltin(true);
        requestParams.setResourceScene(EnumC61028NxI.OTHER);
        requestParams.setEnableRequestReuse(true);
        Boolean bool = Boolean.TRUE;
        requestParams.setEnableMemoryCache(bool);
        requestParams.setEnableCDNCache(bool);
        requestParams.setChannel("reply_options_in_dm_resource");
        requestParams.setBundle("light.json");
        c107964Lo.invoke(value, requestParams, new AqS47S0400000_1(c107874Lf, (InterfaceC88471Ynr<? super String, ? super String, C76800UCe>) null, (InterfaceC65784Pro<C76800UCe>) c107864Le, (InterfaceC88471Ynr<? super String, ? super String, C76800UCe>) null, (InterfaceC65784Pro<C76800UCe>) 7));
        C1DH.LJJIJIIJIL(this.LJ, this.LJIIL);
        C107844Lc c107844Lc = this.LJFF;
        if (c107844Lc == null) {
            return;
        }
        ((ArrayList) C108044Lw.LIZ).add(c107844Lc);
    }

    public final boolean LIZLLL() {
        C5H3 LJJIJL = C17N.LJJIJL(new AqS90S0300000_1(this, (C107834Lb) C17N.LJJIJL(new AqS151S0100000_1(this, 1054)), (C5H3<Integer>) C17N.LJJIJL(C49Z.LJLIL), (C5H3<Integer>) 4));
        C5H3 LJJIJL2 = C17N.LJJIJL(C49Y.LJLIL);
        C5H3 LJJIJL3 = C17N.LJJIJL(new AqS151S0100000_1(this, 1055));
        if (!this.LJIIIIZZ && !this.LJIIIZ && this.LJIIJ && ((Boolean) LJJIJL.getValue()).booleanValue() && !((Boolean) LJJIJL2.getValue()).booleanValue() && ((Boolean) LJJIJL3.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder) {
        if ((viewHolder instanceof AnonymousClass480) && viewHolder.getItemViewType() == EnumC110124Tw.TEXT_RECEIVE.getViewType()) {
            C34B.LIZIZ("SwipeForReplyIntroductionHelper", "attach a text receive VH");
            ((List) this.LJI.getValue()).add(viewHolder);
            if (LIZLLL()) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZIZ), null, null, new C107914Lj(null), 3);
            }
        }
    }

    public final void LIZIZ(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2;
        C29701Eo second;
        if (viewHolder instanceof AnonymousClass480) {
            int itemViewType = viewHolder.getItemViewType();
            EnumC110124Tw enumC110124Tw = EnumC110124Tw.TEXT_RECEIVE;
            if (itemViewType == enumC110124Tw.getViewType()) {
                C34B.LIZIZ("SwipeForReplyIntroductionHelper", "detach a text receive VH");
                ((List) this.LJI.getValue()).remove(viewHolder);
                OSJ<? extends RecyclerView.ViewHolder, ? extends C29701Eo, ? extends ConstraintLayout> osj = this.LJII;
                if (osj != null) {
                    viewHolder2 = osj.getFirst();
                } else {
                    viewHolder2 = null;
                }
                if (o.LJ(viewHolder2, viewHolder) && viewHolder.getItemViewType() == enumC110124Tw.getViewType()) {
                    C34B.LIZIZ("SwipeForReplyIntroductionHelper", "cancel lottie animation");
                    OSJ<? extends RecyclerView.ViewHolder, ? extends C29701Eo, ? extends ConstraintLayout> osj2 = this.LJII;
                    if (osj2 != null && (second = osj2.getSecond()) != null) {
                        second.cancelAnimation();
                    }
                    this.LIZIZ.kv0(EnumC95013o9.FULL);
                    this.LJII = null;
                }
            }
        }
    }

    public final void LJ(AbstractC89473fD messageEvent) {
        o.LJIIIZ(messageEvent, "messageEvent");
        if (!this.LJIIIIZZ || this.LJIIIZ || !this.LJIIJJI.contains(C65352Pkq.LIZ(messageEvent.getClass()))) {
            return;
        }
        this.LJIIIZ = true;
    }

    public final void LJFF(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isConversationAbleToInput ");
        LIZ.append(z);
        C34B.LIZIZ("SwipeForReplyIntroductionHelper", X1D.LIZIZ(LIZ));
        this.LJIIJ = z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.4Lc] */
    public C107834Lb(AbstractC1038245q messageAdapter, ChatRoomViewModel chatRoomViewModel) {
        C73162u0 getNetworkTime = C73162u0.LJLIL;
        o.LJIIIZ(messageAdapter, "messageAdapter");
        o.LJIIIZ(chatRoomViewModel, "chatRoomViewModel");
        o.LJIIIZ(getNetworkTime, "getNetworkTime");
        this.LIZ = messageAdapter;
        this.LIZIZ = chatRoomViewModel;
        this.LIZJ = getNetworkTime;
        this.LIZLLL = 86400;
        this.LJ = 500L;
        this.LJFF = new InterfaceC108034Lv() { // from class: X.4Lc
            @Override // X.InterfaceC108034Lv
            public final void LIZ(File file) {
                Object next;
                OSJ<? extends RecyclerView.ViewHolder, ? extends C29701Eo, ? extends ConstraintLayout> osj;
                ConstraintLayout constraintLayout;
                float f;
                Object LIZ;
                View view;
                C107834Lb c107834Lb = C107834Lb.this;
                c107834Lb.getClass();
                C34B.LIZIZ("SwipeForReplyIntroductionHelper", "play introduction animation");
                if (!c107834Lb.LIZLLL()) {
                    return;
                }
                int intValue = c107834Lb.LIZJ.invoke().intValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("current server time: ");
                LIZ2.append(intValue);
                C34B.LIZIZ("SwipeForReplyIntroductionHelper", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("lottie file: ");
                LIZ3.append(file.getName());
                LIZ3.append("; path: ");
                LIZ3.append(file.getAbsoluteFile());
                C34B.LIZIZ("SwipeForReplyIntroductionHelper", X1D.LIZIZ(LIZ3));
                C47Y.LIZ().storeInt("key_last_play_time", intValue);
                Iterator it = ((List) c107834Lb.LJI.getValue()).iterator();
                if (!it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        int layoutPosition = ((RecyclerView.ViewHolder) next).getLayoutPosition();
                        do {
                            Object next2 = it.next();
                            int layoutPosition2 = ((RecyclerView.ViewHolder) next2).getLayoutPosition();
                            if (layoutPosition > layoutPosition2) {
                                next = next2;
                                layoutPosition = layoutPosition2;
                            }
                        } while (it.hasNext());
                    }
                }
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) next;
                if (viewHolder == null) {
                    return;
                }
                View findViewById = viewHolder.itemView.findViewById(R.id.g_x);
                if (findViewById instanceof ViewStub) {
                    C34B.LIZIZ("SwipeForReplyIntroductionHelper", "inflate view");
                    View inflate = ((ViewStub) findViewById).inflate();
                    if (inflate instanceof ConstraintLayout) {
                        if (inflate != null) {
                            view = inflate.findViewById(R.id.kwm);
                            osj = new OSJ<>(viewHolder, view, inflate);
                        }
                    } else {
                        inflate = null;
                    }
                    view = null;
                    osj = new OSJ<>(viewHolder, view, inflate);
                } else if (findViewById instanceof ConstraintLayout) {
                    C34B.LIZIZ("SwipeForReplyIntroductionHelper", "no need to inflate view");
                    osj = new OSJ<>(viewHolder, findViewById.findViewById(R.id.kwm), findViewById);
                } else {
                    C34B.LIZJ("SwipeForReplyIntroductionHelper", "cannot find any lottie animation view");
                    return;
                }
                c107834Lb.LJII = osj;
                C29701Eo second = osj.getSecond();
                if (second == null) {
                    return;
                }
                OSJ<? extends RecyclerView.ViewHolder, ? extends C29701Eo, ? extends ConstraintLayout> osj2 = c107834Lb.LJII;
                if (osj2 != null) {
                    constraintLayout = osj2.getThird();
                    if (constraintLayout != null) {
                        C17N.LJJLIIIJJI(constraintLayout);
                    }
                } else {
                    constraintLayout = null;
                }
                if (C90193gN.LIZ()) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                second.setScaleX(f);
                try {
                    second.setAnimation(new JsonReader(new FileReader(file.getAbsoluteFile())), (String) null);
                    second.removeAllAnimatorListeners();
                    second.addAnimatorListener(new ALAdapterS0S0300000_1(c107834Lb, second, constraintLayout, 2));
                    c107834Lb.LIZIZ.kv0(EnumC95013o9.DISABLED);
                    second.playAnimation();
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl == null) {
                    return;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("play lottie, error: ");
                LIZ4.append(m10exceptionOrNullimpl.getMessage());
                C34B.LIZJ("SwipeForReplyIntroductionHelper", X1D.LIZIZ(LIZ4));
            }
        };
        this.LJI = C221108m2.LIZIZ(C107884Lg.LJLIL);
        this.LJIIIIZZ = true;
        this.LJIIJ = true;
        this.LJIIJJI = C47261Igj.LJJIJIIJI(C65352Pkq.LIZ(C91233i3.class), C65352Pkq.LIZ(C91603ie.class), C65352Pkq.LIZ(C89463fC.class));
        this.LJIIL = new ARunnableS37S0100000_1(this, 161);
        this.LJIILIIL = new C107854Ld(this);
    }
}
