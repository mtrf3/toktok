package X;

import Y.IDeS150S0200000_1;
import Y.IDeS360S0100000_1;
import android.animation.ValueAnimator;
import android.util.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedstickers.ui.SuggestedStickerBanner$loadData$1", f = "SuggestedStickerBanner.kt", l = {351}, m = "invokeSuspend")
/* renamed from: X.3F9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C73122tw LJLILLLLZI;
    public final /* synthetic */ C3WX LJLJI;
    public final /* synthetic */ C99033ud LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F9(C73122tw c73122tw, C3WX c3wx, C99033ud c99033ud, String str, InterfaceC67352kd<? super C3F9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c73122tw;
        this.LJLJI = c3wx;
        this.LJLJJI = c99033ud;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3F9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            C73022tm c73022tm = C73022tm.LJLIL;
            C73122tw wrapper = this.LJLILLLLZI;
            o.LJIIIZ(wrapper, "wrapper");
            XKX.LIZLLL(c73022tm, null, null, new C73012tl(null), 3);
            IDeS360S0100000_1 iDeS360S0100000_1 = new IDeS360S0100000_1(new IDeS360S0100000_1(new IDeS360S0100000_1(new IDeS150S0200000_1(new IDeS360S0100000_1(new IDeS360S0100000_1(C73022tm.LJLJI, 2), 3), wrapper, 0), 4), 5), 1);
            final C3WX c3wx = this.LJLJI;
            final C99033ud c99033ud = this.LJLJJI;
            final String str = this.LJLJJL;
            InterfaceC64672gJ<List<? extends InterfaceC73202u4>> interfaceC64672gJ = new InterfaceC64672gJ<List<? extends InterfaceC73202u4>>() { // from class: X.3P5
                /* JADX WARN: Type inference failed for: r3v0, types: [X.3P9] */
                @Override // X.InterfaceC64672gJ
                public final Object emit(List<? extends InterfaceC73202u4> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    String str2;
                    C3PB chatType;
                    C3P7 suggestedChatType;
                    List<? extends InterfaceC73202u4> list2 = list;
                    C3WX.this.LJLILLLLZI = new C3FD(list2) { // from class: X.2W0
                        public final List<InterfaceC73202u4> LIZ;

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            return (obj2 instanceof C2W0) && o.LJ(this.LIZ, ((C2W0) obj2).LIZ);
                        }

                        public final int hashCode() {
                            return this.LIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Loaded(stickers=");
                            return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            o.LJIIIZ(list2, "stickers");
                            this.LIZ = list2;
                        }
                    };
                    RecyclerView recyclerview = C3WX.this.getRecyclerview();
                    final C3WX c3wx2 = C3WX.this;
                    final C99033ud c99033ud2 = c99033ud;
                    final String str3 = str;
                    recyclerview.setAdapter(new C88503de(list2, new InterfaceC88543di() { // from class: X.3P9
                        @Override // X.InterfaceC88543di
                        public final void LLLL() {
                            C3PD c3pd = C3WX.this.LJLJJLL;
                            if (c3pd != null) {
                                c3pd.LLLL();
                            }
                        }

                        @Override // X.InterfaceC88543di
                        public final void LIZ(VideoSticker sticker) {
                            String str4;
                            C3PB c3pb;
                            C98523to c98523to;
                            IMUser fromUser;
                            o.LJIIIZ(sticker, "sticker");
                            C3PD c3pd = C3WX.this.LJLJJLL;
                            if (c3pd != null) {
                                c3pd.LLLLII(sticker);
                            }
                            C99033ud c99033ud3 = c99033ud2;
                            String str5 = null;
                            if (c99033ud3 != null) {
                                str4 = c99033ud3.getConversationId();
                            } else {
                                str4 = null;
                            }
                            C99033ud c99033ud4 = c99033ud2;
                            if ((c99033ud4 instanceof C98523to) && (c98523to = (C98523to) c99033ud4) != null && (fromUser = c98523to.getFromUser()) != null) {
                                str5 = fromUser.getUid();
                            }
                            if (c99033ud2 instanceof C98523to) {
                                c3pb = C3PB.SINGLE;
                            } else {
                                c3pb = C3PB.GROUP;
                            }
                            C3P6 c3p6 = C3P7.Companion;
                            String str6 = str3;
                            c3p6.getClass();
                            C3P8.LIZ(str4, str5, c3pb, C3P6.LIZ(str6), C73022tm.LJFF(), new C3PA(C3PC.VIDEO_STICKER, sticker.getVideoStickerId()));
                        }

                        @Override // X.InterfaceC88543di
                        public final void LIZIZ(SetSticker sticker) {
                            String str4;
                            C3PB c3pb;
                            C98523to c98523to;
                            IMUser fromUser;
                            o.LJIIIZ(sticker, "sticker");
                            C3PD c3pd = C3WX.this.LJLJJLL;
                            if (c3pd != null) {
                                c3pd.LLLLIIL(sticker);
                            }
                            C99033ud c99033ud3 = c99033ud2;
                            String str5 = null;
                            if (c99033ud3 != null) {
                                str4 = c99033ud3.getConversationId();
                            } else {
                                str4 = null;
                            }
                            C99033ud c99033ud4 = c99033ud2;
                            if ((c99033ud4 instanceof C98523to) && (c98523to = (C98523to) c99033ud4) != null && (fromUser = c98523to.getFromUser()) != null) {
                                str5 = fromUser.getUid();
                            }
                            if (c99033ud2 instanceof C98523to) {
                                c3pb = C3PB.SINGLE;
                            } else {
                                c3pb = C3PB.GROUP;
                            }
                            C3P6 c3p6 = C3P7.Companion;
                            String str6 = str3;
                            c3p6.getClass();
                            C3P8.LIZ(str4, str5, c3pb, C3P6.LIZ(str6), C73022tm.LJFF(), new C3PA(C3PC.STICKER, sticker.getStickerId()));
                        }
                    }));
                    C3WX c3wx3 = C3WX.this;
                    ValueAnimator valueAnimator = c3wx3.LJLLILLLL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    String str4 = null;
                    c3wx3.LJLLILLLL = c3wx3.LIZ(0.0f, C3WX.LJLLJ, null);
                    C99033ud c99033ud3 = c99033ud;
                    if (c99033ud3 != null) {
                        str2 = c99033ud3.getConversationId();
                    } else {
                        str2 = null;
                    }
                    C99033ud c99033ud4 = c99033ud;
                    if ((c99033ud4 instanceof C98523to) && c99033ud4 != null) {
                        str4 = c99033ud4.getSingleChatFromUserId();
                    }
                    if (c99033ud instanceof C98523to) {
                        chatType = C3PB.SINGLE;
                    } else {
                        chatType = C3PB.GROUP;
                    }
                    String str5 = str;
                    if (o.LJ(str5, "sayhi_suggested_stickers")) {
                        suggestedChatType = C3P7.SAY_HI;
                    } else if (o.LJ(str5, "recommended_chat_suggested_stickers")) {
                        suggestedChatType = C3P7.RECOMMENDED_CHAT;
                    } else {
                        suggestedChatType = C3P7.OTHERS;
                    }
                    int LJFF = C73022tm.LJFF();
                    C85323Wm onEventV3 = C772831o.LIZ();
                    o.LJIIIZ(chatType, "chatType");
                    o.LJIIIZ(suggestedChatType, "suggestedChatType");
                    o.LJIIIZ(onEventV3, "onEventV3");
                    int i2 = 0;
                    OSZ[] oszArr = {new OSZ("enter_from", "chat"), new OSZ("conversation_id", String.valueOf(str2)), new OSZ("to_user_id", String.valueOf(str4)), new OSZ("chat_type", chatType.getValue()), new OSZ("suggested_chat_type", suggestedChatType.getValue()), new OSZ("num_stickers", String.valueOf(LJFF))};
                    ArrayMap arrayMap = new ArrayMap();
                    do {
                        OSZ osz = oszArr[i2];
                        arrayMap.put(osz.getFirst(), osz.getSecond());
                        i2++;
                    } while (i2 < 6);
                    onEventV3.LIZIZ("show_suggested_stickers_panel", arrayMap);
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (iDeS360S0100000_1.collect(interfaceC64672gJ, this) == enumC58928NAu) {
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
