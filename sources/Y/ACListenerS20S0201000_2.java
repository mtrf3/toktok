package Y;

import X.AnonymousClass551;
import X.AnonymousClass572;
import X.AnonymousClass574;
import X.AnonymousClass576;
import X.AnonymousClass699;
import X.C125014vR;
import X.C127254z3;
import X.C1296356x;
import X.C141335gf;
import X.C145085mi;
import X.C145995oB;
import X.C1554868i;
import X.C1554968j;
import X.C158026Ic;
import X.C158036Id;
import X.C161386Va;
import X.C163996c7;
import X.C176996x5;
import X.C198517qh;
import X.C1YZ;
import X.C29701Eo;
import X.C32151Nz;
import X.C3C5;
import X.C47918IrK;
import X.C51618KNq;
import X.C5QW;
import X.C68M;
import X.C69P;
import X.C69W;
import X.C69Y;
import X.C69Z;
import X.C6IQ;
import X.C6IY;
import X.C6PB;
import X.C6VZ;
import X.C6ZS;
import X.FMX;
import X.H7B;
import X.H8F;
import X.InterfaceC127784zu;
import X.InterfaceC1296256w;
import X.InterfaceC1555668q;
import X.InterfaceC176256vt;
import X.X1D;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.upvote.publish.comment.UpvoteCommentDialogFragment;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import com.ss.android.ugc.gamora.editorpro.soundeffect.model.SoundEffectTabModel;
import com.ss.android.ugc.gamora.editorpro.soundeffect.ui.SoundEffectFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACListenerS20S0201000_2 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        switch (aCListenerS20S0201000_2.i2) {
            case 0:
                C176996x5 c176996x5 = (C176996x5) aCListenerS20S0201000_2.l0;
                InterfaceC176256vt interfaceC176256vt = (InterfaceC176256vt) aCListenerS20S0201000_2.l1;
                c176996x5.LJIILJJIL();
                interfaceC176256vt.LJ();
                return;
            default:
                C158026Ic c158026Ic = (C158026Ic) aCListenerS20S0201000_2.l0;
                View view2 = (View) aCListenerS20S0201000_2.l1;
                c158026Ic.LIZ();
                C158026Ic.LIZIZ(view, false);
                ((C158036Id) view).LJLJJL = true;
                C6IY c6iy = c158026Ic.LJLJJI;
                if (c6iy != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    C6IQ c6iq = (C6IQ) ((C1YZ) c6iy).LIZ;
                    c6iq.LJLJI.LJI(c6iq.LJLJJL, intValue);
                    c6iq.LJLJLJ = intValue;
                }
                c158026Ic.LJLJL.LIZ(view2);
                return;
        }
    }

    public static final void onClick$1(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        C6VZ c6vz = (C6VZ) aCListenerS20S0201000_2.l0;
        int i = c6vz.LJLILLLLZI;
        int i2 = aCListenerS20S0201000_2.i2;
        if (i == i2) {
            return;
        }
        c6vz.LJLIL.invoke(((C161386Va) aCListenerS20S0201000_2.l1).LJLIL, Integer.valueOf(i2));
        C6VZ c6vz2 = (C6VZ) aCListenerS20S0201000_2.l0;
        int i3 = c6vz2.LJLILLLLZI;
        c6vz2.LJLILLLLZI = aCListenerS20S0201000_2.i2;
        c6vz2.notifyItemChanged(i3, 1);
        C6VZ c6vz3 = (C6VZ) aCListenerS20S0201000_2.l0;
        c6vz3.notifyItemChanged(c6vz3.LJLILLLLZI, 1);
    }

    public static final void onClick$2(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        switch (aCListenerS20S0201000_2.i2) {
            case 0:
                C51618KNq c51618KNq = (C51618KNq) aCListenerS20S0201000_2.l0;
                Music music = (Music) aCListenerS20S0201000_2.l1;
                c51618KNq.getClass();
                MobClick obtain = MobClick.obtain();
                obtain.setEventName("choose_music");
                obtain.setLabelName(c51618KNq.LJLJJI);
                obtain.setValue(music.getMid());
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("host", c51618KNq.LJLJI);
                obtain.setJsonObject(c198517qh.LJ());
                FMX.onEvent(obtain);
                SmartRoute buildRoute = SmartRouter.buildRoute(c51618KNq.LJLILLLLZI, "aweme://music/detail");
                buildRoute.withParam("id", music.getMid());
                buildRoute.withParam("extra_music_from", "from_related_tag");
                buildRoute.open();
                return;
            default:
                C1554968j c1554968j = (C1554968j) aCListenerS20S0201000_2.l0;
                final C1554868i c1554868i = (C1554868i) aCListenerS20S0201000_2.l1;
                c1554968j.getClass();
                if (c1554868i.getFontData() != null) {
                    c1554968j.LJLJJI = c1554868i.getFontData().fileName;
                }
                TextFontStyleData textFontStyleData = c1554868i.LJLJJL;
                if (textFontStyleData == null) {
                    return;
                }
                if (textFontStyleData.LIZJ()) {
                    TextFontStyleData fontData = c1554868i.getFontData();
                    InterfaceC1555668q interfaceC1555668q = c1554968j.LJLILLLLZI;
                    if (interfaceC1555668q != null) {
                        interfaceC1555668q.LIZ(fontData);
                    }
                    c1554968j.LIZJ();
                    return;
                }
                if (c1554868i.LJLJJL.LIZIZ == 3) {
                    c1554868i.LIZIZ();
                    return;
                }
                if (!C47918IrK.LIZ(c1554868i.getContext())) {
                    C6PB.LJ().LIZIZ(R.string.e8f, c1554868i.getContext());
                    return;
                }
                final C68M LJIIJ = C68M.LJIIJ();
                Context context = c1554868i.getContext();
                TextFontStyleData textFontStyleData2 = c1554868i.LJLJJL;
                LJIIJ.getClass();
                if (context != null) {
                    AnonymousClass699.LIZ().LJJIIZI(textFontStyleData2.LIZJ, new IFetchEffectListener() { // from class: X.68S
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onStart(Effect effect) {
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(Effect effect) {
                            TextFontStyleData LJIIZILJ = C68M.this.LJIIZILJ(effect);
                            C68T c68t = c1554868i;
                            if (c68t != null) {
                                if (LJIIZILJ != null) {
                                    c68t.LIZ(LJIIZILJ, true);
                                } else {
                                    c68t.onError();
                                }
                            }
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                            try {
                                TextFontStyleData textFontStyleData3 = (TextFontStyleData) GsonProtectorUtils.fromJson(C6PB.LIZIZ(), effect.getExtra(), TextFontStyleData.class);
                                if (C68M.this.LIZ.get(textFontStyleData3.fileName) != null) {
                                    C68M.this.LIZ.get(textFontStyleData3.fileName).LIZIZ = 2;
                                }
                                C68M.LJIILLIIL(textFontStyleData3, false, exceptionResult.getException());
                            } catch (RuntimeException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            C68T c68t = c1554868i;
                            if (c68t != null) {
                                c68t.onError();
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("textFontDownload err: ");
                            LIZ.append(exceptionResult.getMsg());
                            H7B.LIZJ(X1D.LIZIZ(LIZ));
                        }
                    });
                }
                c1554868i.LJLJJL.LIZIZ = 3;
                c1554868i.LIZIZ();
                return;
        }
    }

    public static final void onClick$3(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        boolean z;
        String str;
        String extra;
        ViewPager viewPager = ((SoundEffectFragment) aCListenerS20S0201000_2.l0).LLIIII;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS20S0201000_2.i2, true);
            if (aCListenerS20S0201000_2.i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            String str2 = ((SoundEffectTabModel) aCListenerS20S0201000_2.l1).name;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            VideoPublishEditModel em = ((SoundEffectFragment) aCListenerS20S0201000_2.l0).em();
            EditorProContext Jl = ((SoundEffectFragment) aCListenerS20S0201000_2.l0).Jl();
            if (em != null && Jl != null) {
                C145995oB LJFF = C5QW.LJFF(em, Jl);
                LJFF.LJI("tab_name", str2);
                if (z) {
                    str = "favorite";
                } else {
                    str = "other";
                }
                LJFF.LJI("sound_effect_source", str);
                NLETrack LJIJI = C32151Nz.LJIJI(Jl);
                if (LJIJI != null && (extra = LJIJI.getExtra("slot_extra_music_id")) != null) {
                    str3 = extra;
                }
                LJFF.LJI("music_id", str3);
                LJFF.LIZ(1, "is_editor_pro");
                FMX.LJIIL("click_sound_effect_tab", LJFF.LIZ);
                return;
            }
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public static final void onClick$4(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        int i;
        C69W c69w = (C69W) aCListenerS20S0201000_2.l0;
        if (c69w.LJLJLJ == aCListenerS20S0201000_2.i2) {
            i = ((C69Y) aCListenerS20S0201000_2.l1).LJLIL.getOffsetForPosition(c69w.LJLJJLL, c69w.LJLJL);
        } else {
            i = -1;
        }
        C69Z c69z = ((C69W) aCListenerS20S0201000_2.l0).LJLJJL;
        if (c69z != null) {
            c69z.LIZ(aCListenerS20S0201000_2.i2, i);
        }
    }

    public static final void onClick$5(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        AnonymousClass574 anonymousClass574;
        InterfaceC1296256w interfaceC1296256w;
        C1296356x c1296356x = ((AnonymousClass576) aCListenerS20S0201000_2.l0).LJLJI;
        if (c1296356x != null) {
            AnonymousClass572 anonymousClass572 = (AnonymousClass572) aCListenerS20S0201000_2.l1;
            int i = aCListenerS20S0201000_2.i2;
            AnonymousClass551 anonymousClass551 = c1296356x.LIZ.LJLJI;
            int i2 = 0;
            if (anonymousClass551 != null && anonymousClass551.LJIILL > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                AnonymousClass574 anonymousClass5742 = c1296356x.LIZ;
                long j = currentTimeMillis - anonymousClass5742.LJLL;
                AnonymousClass551 anonymousClass5512 = anonymousClass5742.LJLJI;
                if (anonymousClass5512 != null) {
                    i2 = anonymousClass5512.LJIILL;
                }
                if (j < i2) {
                    return;
                }
            }
            c1296356x.LIZ.LJLL = System.currentTimeMillis();
            if (anonymousClass572 == null || (interfaceC1296256w = (anonymousClass574 = c1296356x.LIZ).LJLJJLL) == null) {
                return;
            }
            interfaceC1296256w.LIZ(anonymousClass572.LJLIL, i, anonymousClass572.LJLJJL, new C127254z3(anonymousClass574, anonymousClass572, i, anonymousClass572));
        }
    }

    public static final void onClick$6(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        InterfaceC127784zu player;
        ((C69P) aCListenerS20S0201000_2.l0).LJLLILLLL = aCListenerS20S0201000_2.i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> click play, startTime = ");
        long j = 1000;
        LIZ.append(((TextStickerData) ListProtector.get(((C69P) aCListenerS20S0201000_2.l0).LJLJL, aCListenerS20S0201000_2.i2)).getStartTime() * j);
        LIZ.append(", endTime = ");
        LIZ.append(((TextStickerData) ListProtector.get(((C69P) aCListenerS20S0201000_2.l0).LJLJL, aCListenerS20S0201000_2.i2)).getEndTime() * j);
        H7B.LJ(X1D.LIZIZ(LIZ));
        EditorProContext editorProContext = ((C69P) aCListenerS20S0201000_2.l0).LJLILLLLZI;
        if (editorProContext != null && (player = editorProContext.getPlayer()) != null) {
            C125014vR.LIZ(player, ((TextStickerData) ListProtector.get(((C69P) aCListenerS20S0201000_2.l0).LJLJL, aCListenerS20S0201000_2.i2)).getStartTime() * j, ((TextStickerData) ListProtector.get(((C69P) aCListenerS20S0201000_2.l0).LJLJL, aCListenerS20S0201000_2.i2)).getEndTime() * j, false, 12);
        }
        C29701Eo c29701Eo = ((C145085mi) aCListenerS20S0201000_2.l1).LJLJI;
        c29701Eo.setVisibility(0);
        c29701Eo.setAnimation("little_audio_wave_anim.json");
        c29701Eo.setRepeatCount(-1);
        c29701Eo.playAnimation();
        ((C145085mi) aCListenerS20S0201000_2.l1).LJLILLLLZI.setVisibility(8);
        C69P c69p = (C69P) aCListenerS20S0201000_2.l0;
        H8F.LJJIZ(1, c69p.LJLIL, c69p.LJLJI, c69p.LJLJJI);
    }

    public static final void onClick$7(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        if (C6ZS.LIZ(view)) {
            return;
        }
        ((C163996c7) aCListenerS20S0201000_2.l0).LJLIL.h1((NatureSpeciesModel) aCListenerS20S0201000_2.l1, aCListenerS20S0201000_2.i2);
    }

    public static final void onClick$8(ACListenerS20S0201000_2 aCListenerS20S0201000_2, View view) {
        Object LIZ;
        UpvoteCommentDialogFragment upvoteCommentDialogFragment = (UpvoteCommentDialogFragment) aCListenerS20S0201000_2.l0;
        String str = (String) ListProtector.get((List) aCListenerS20S0201000_2.l1, aCListenerS20S0201000_2.i2);
        upvoteCommentDialogFragment.getClass();
        int i = 0;
        if (str == null || str.length() == 0) {
            return;
        }
        int selectionStart = upvoteCommentDialogFragment.xl().getSelectionStart();
        if (selectionStart < 0) {
            selectionStart = 0;
        }
        int selectionEnd = upvoteCommentDialogFragment.xl().getSelectionEnd();
        if (selectionEnd >= 0) {
            i = selectionEnd;
        }
        if (selectionStart == i) {
            Editable text = upvoteCommentDialogFragment.xl().getText();
            if (text != null) {
                text.insert(selectionStart, str);
            }
        } else {
            try {
                Editable text2 = upvoteCommentDialogFragment.xl().getText();
                if (text2 != null) {
                    LIZ = text2.replace(selectionStart, i, str);
                } else {
                    LIZ = null;
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
        }
        upvoteCommentDialogFragment.xl().setSelection(Math.min(str.length() + selectionStart, upvoteCommentDialogFragment.xl().length()));
    }

    public ACListenerS20S0201000_2(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
