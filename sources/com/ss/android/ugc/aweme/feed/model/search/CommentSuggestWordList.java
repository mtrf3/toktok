package com.ss.android.ugc.aweme.feed.model.search;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class CommentSuggestWordList implements Serializable {

    @InterfaceC65349Pkn("suggest_words")
    public List<SuggestWordStruct> suggestWords;

    public final String jsonStringToServer() {
        Object obj;
        List<WordStruct> words;
        String str;
        List<SuggestWordStruct> list = this.suggestWords;
        boolean z = false;
        if (list != null && list.isEmpty()) {
            z = true;
        }
        if (z) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<SuggestWordStruct> list2 = this.suggestWords;
        if (list2 != null) {
            for (SuggestWordStruct suggestWordStruct : list2) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                if (suggestWordStruct != null && (words = suggestWordStruct.getWords()) != null) {
                    for (WordStruct wordStruct : words) {
                        JSONObject jSONObject3 = new JSONObject();
                        if (wordStruct == null || (str = wordStruct.getWord()) == null) {
                            str = "";
                        }
                        jSONObject3.put("word", str);
                        jSONArray2.put(jSONObject3);
                    }
                }
                jSONObject2.put("suggestWord", jSONArray2);
                if (suggestWordStruct == null || (obj = suggestWordStruct.getScene()) == null) {
                    obj = "";
                }
                jSONObject2.put(WM7.SCENE_SERVICE, obj);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("suggestWordsList", jSONArray);
        String jSONObject4 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject4, "jsonString.toString()");
        return jSONObject4;
    }

    public final List<SuggestWordStruct> getSuggestWords() {
        return this.suggestWords;
    }

    public final void setSuggestWords(List<SuggestWordStruct> list) {
        this.suggestWords = list;
    }
}
