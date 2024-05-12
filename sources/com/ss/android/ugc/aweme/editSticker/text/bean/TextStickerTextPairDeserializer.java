package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C6PB;
import X.C79475VHb;
import X.C79476VHc;
import X.H7B;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class TextStickerTextPairDeserializer implements i<TextStickerTextPair> {
    @Override // com.google.gson.i
    public final TextStickerTextPair deserialize(j jVar, Type type, h hVar) {
        TextStickerTextPair textStickerTextPair;
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("a");
            if (LJJIJ == null && (LJJIJ = LJIIZILJ.LJJIJ("first")) == null) {
                textStickerTextPair = new TextStickerTextPair(null, null, 3, null);
            } else {
                j LJJIJ2 = LJIIZILJ.LJJIJ("b");
                if (LJJIJ2 == null && (LJJIJ2 = LJIIZILJ.LJJIJ("second")) == null) {
                    textStickerTextPair = new TextStickerTextPair(null, null, 3, null);
                } else if (LJJIJ instanceof p) {
                    String jVar2 = LJJIJ2.LJIILLIIL().toString();
                    o.LJIIIIZZ(jVar2, "bField.asJsonArray.toString()");
                    String LJJIFFI = LJJIJ.LJJIFFI();
                    o.LJIIIIZZ(LJJIFFI, "aField.asString");
                    Object LJII = C6PB.LIZIZ().LJII(jVar2, new C79475VHb().getType());
                    o.LJIIIIZZ(LJII, "gson.fromJson<List<Inter…                        )");
                    textStickerTextPair = new TextStickerTextPair(LJJIFFI, (List) LJII);
                } else if (LJJIJ2 instanceof p) {
                    String jVar3 = LJJIJ.LJIILLIIL().toString();
                    o.LJIIIIZZ(jVar3, "aField.asJsonArray.toString()");
                    String LJJIFFI2 = LJJIJ2.LJJIFFI();
                    o.LJIIIIZZ(LJJIFFI2, "bField.asString");
                    Object LJII2 = C6PB.LIZIZ().LJII(jVar3, new C79476VHc().getType());
                    o.LJIIIIZZ(LJII2, "gson.fromJson<List<Inter…                        )");
                    textStickerTextPair = new TextStickerTextPair(LJJIFFI2, (List) LJII2);
                } else {
                    textStickerTextPair = new TextStickerTextPair(null, null, 3, null);
                }
            }
            return textStickerTextPair;
        } catch (Exception e) {
            H7B.LIZLLL(e);
            return new TextStickerTextPair(null, null, 3, null);
        }
    }
}
